package costumer;

import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;

public class Municipality extends Costumer implements acci{

    private String mayor_name;
    private int region;

    public String getMayor_name(){return mayor_name;}
    public int getRegion(){return region;}
    public void setMayor_name(String mayor_name){this.mayor_name=mayor_name;}
    public void setRegion(int region){this.region=region;}

    //---
    String infopath="/home/alireza/Desktop/accounting_project_info/municipalities_info/"+name;
    String incomepath="/home/alireza/Desktop/accounting_project_info/municipalities_info/"+name+"/income";
    String expencepath="/home/alireza/Desktop/accounting_project_info/municipalities_info/"+name+"expense";

    Municipality(String name, String email, String phone_number
            , String activity_type, ArrayList<String> employee_names,String mayor_name,int region,
                 String date_Instrument , String price_Instrument , String side1_name_Instrument , String side2_name_Instrument,
                 String ID_Factor, String date_Factor , Factor.types type_Factor , String sender_Factor ,String receiver_Factor , ArrayList<Product> products_Factor
            ,String date_Salary , String price_Salary , String emp_name_Salary) {

        super(name, email, phone_number, activity_type, employee_names);

        this.mayor_name=mayor_name;
        this.region=region;

        new File(incomepath).mkdirs();
        new File(incomepath,"expense").mkdir();

        //income:

        //expence:
        Instrument Municipality_Instrument = new Instrument(date_Instrument , price_Instrument , side1_name_Instrument , side2_name_Instrument);
        Factor Municipality_Factor = new Factor(ID_Factor, date_Factor ,  type_Factor , sender_Factor ,receiver_Factor , products_Factor);
        Salary Municipality_Salary=new Salary(date_Salary , price_Salary , emp_name_Salary);

    }

    @Override
    public void info() throws Exception {
        File info = new File(infopath, "info.txt");
        info.createNewFile();
        Formatter fm = new Formatter(info);
        fm.format("%s %s %s %s %s %s %s %s ", "Name :", name, "\t| email :", email, "\t| Activity type :", activity_type, "\t| Phone Number :", phone_number);
        fm.format("%s %s %s %i ", "\n Mayor name :", mayor_name, "\t| region :", region);
        fm.format(" %s %s ", "\nemployee_names :", employee_names.toString());
        fm.flush();
        fm.close();

    }

    @Override
    public void income()throws Exception {

    }

    @Override
    public void expence()throws Exception {
        File expence = new File(expencepath, "expence.txt");
        expence.createNewFile();
        Formatter fm = new Formatter(expence);
        //???
        fm.format("%s %s %s %s %s %s %s ", "<<Instrument>>\n", "|date:"," Municipality_Instrument.getDate()", "\t| price :", "??????", "\t| emp_name :", "??????");
        //???
        fm.flush();
        fm.close();
    }
}
