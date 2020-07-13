package graphic;

import javax.swing.*;
import java.awt.*;

public class User_Pass {

    boolean Exist_Username(String Username)
    {

    }


    boolean True_Password(String Username,String Password)
    {

    }


    boolean Creat_Account(String Sug_Username, String Sug_Pass)throws Exception
    {
        if(!Exist_Username(Sug_Username))
        {
           // JOptionPane.showMessageDialog(,"this usrename is unvalid");
            return false;
        }
        else
        {
            //write in file
            // JOptionPane.showMessageDialog(,"this account created");
            return true;
        }
    }


    boolean Login(String Username,String Password)
    {
        if(Exist_Username(Username)) {
            if (True_Password(Username, Password)) {
                // JOptionPane.showMessageDialog(,"welcome"+Username);
                return true;
            } else {
                // JOptionPane.showMessageDialog(,"password is wrong");
                return false;
            }
        }
        else
        {
            // JOptionPane.showMessageDialog(,"this account doseent exist");
            return false;
        }
    }

}
