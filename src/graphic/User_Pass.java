package graphic;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class User_Pass {

 File file = new File(".","Usrename_and_Password");//please check this path

  //=======================================================
  boolean Exist_Username(String Username) throws Exception{
        boolean a=false;
        FileReader fr = new FileReader(file);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            String [] up;//up:username and password
            up=line.split(" ");//We use this method becouse when write a usre info in line 62 we write a space between username and password
            while (line != null) {
                if(up[0].equals(Username)) {//up[0] point to username and up[1] point to password
                    a = true;
                    break;}
                line = br.readLine();
                up=line.split(" ");//We use this method becouse when write a usre info in line 62 we a space between username and password
            }
        }
        return a;
    }
    //=======================================================
    boolean True_Password(String Username,String Password)throws Exception
    {
        boolean a=false;
        FileReader fr = new FileReader(file);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            String [] up;//up:username and password
            up=line.split(" ");//We use this method becouse when write a usre info in line 62 we write a space between username and password
            while (line != null) {
                if(up[0].equals(Username) && up[1].equals(Username) ) {//up[0] point to username and up[1] point to password
                    a = true;
                    break;}
                line = br.readLine();
                up=line.split(" ");//We use this method becouse when write a usre info in line 62 we  a space between username and password
            }
        }
        return a;
    }
    //=======================================================
    boolean Creat_Account(String Sug_Username, String Sug_Pass)throws Exception
    {
        if(!Exist_Username(Sug_Username))
        {
            JOptionPane.showMessageDialog(new JFrame(),"this usrename is unvalid");
            return false;
        }
        else
        {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(Sug_Username.strip()+" "+Sug_Pass.strip());
            fileWriter.close();

            JOptionPane.showMessageDialog(new JFrame(),"this account created");
            return true;
        }
    }
    //=======================================================
    boolean Login(String Username,String Password) throws Exception
    {
        if(Exist_Username(Username)) {
            if (True_Password(Username, Password)) {
                 JOptionPane.showMessageDialog(new JFrame(),"welcome"+Username);
                return true;
            } else {
                 JOptionPane.showMessageDialog(new JFrame(),"password is wrong");
                return false;
            }
        }
        else
        {
             JOptionPane.showMessageDialog(new JFrame(),"this account doseent exist");
            return false;
        }
    }
    //=======================================================
}

