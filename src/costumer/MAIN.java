package costumer;

import graphic.Main;
import graphic.User_Pass;

import java.awt.desktop.UserSessionEvent;
import java.io.*;

public class MAIN {
    public static void main(String[] args) throws Exception {

//        System.out.println(User_Pass.login("mohama" , "1379"));

    }
    // for 4 methods
    public static <T>T READ_OBJECT(File file) throws Exception
    {
        FileInputStream fin = new FileInputStream(file);
        ObjectInputStream oin = new ObjectInputStream(fin);
        T obj = (T)oin.readObject();
        fin.close();
        oin.close();
        return obj;
    }

    public static <T extends  Costumer>void WRITE_OBJECT(File file , T cf) throws Exception
    {
        FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(cf);
        fout.close();
        out.close();
    }

    public static <T extends  Costumer> String READ(File file) throws Exception
    {
        FileReader fileReader = new FileReader(file);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        }
    }


    public static void WRITE(File file , String text) throws Exception
    {
        FileWriter fileWriter = new FileWriter(file , true);
        fileWriter.append(text);
        fileWriter.close();
    }
}
