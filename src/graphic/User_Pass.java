package graphic;

import costumer.MAIN;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public  class User_Pass {

     static File file = new File("User.txt");

    //=======================================================
    public static boolean Exist_Username(String Username) throws Exception {
        if(file.exists()) {
            boolean exits = false;
            FileReader fr = new FileReader(file);
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line = br.readLine();
                String[] up;       //up:username and password
                while (line != null) {
                    up = line.split(" ");
                    if (up[0].equals(Username)) {            //up[0] point to username and up[1] point to password
                        exits = true;
                        break;
                    }
                    line = br.readLine();
                }
            }
            return exits;
        }
        else
        {
            file.createNewFile();
            return Exist_Username(Username);
        }
    }

    //=======================================================
    static public boolean create_Account(String Sug_Username, String Sug_Pass) throws Exception {
        if (Exist_Username(Sug_Username)) {
//            JOptionPane.showMessageDialog(new JFrame(), "this usrename is unvalid");
            return false;
        } else {
            MAIN.WRITE(file , Sug_Username + " " + Sug_Pass + "\n");
//            JOptionPane.showMessageDialog(new JFrame(), "this account created");
            return true;
        }
    }

    static public boolean login(String Username,String Password)throws Exception
    {
        if(file.exists())
          {  boolean a=false;
            FileReader fr = new FileReader(file);
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line = br.readLine();
                String [] up;       //up:username and password
                while (line != null) {
                    up=line.split(" ");
                    if(up[0].equals(Username) && up[1].equals(Password) ) {     //up[0] points to username and up[1] points to password
                        a = true;
                        break;
                    }
                    line = br.readLine();
                }
            }
            return a;
          }
        else
            return false;
    }
    //=======================================================
}

