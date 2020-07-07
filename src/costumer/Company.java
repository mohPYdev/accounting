package costumer;

import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;

public class Company extends Costumer implements acci {
    private int econemic_code;
    private String boss_name;
    private String address;
    private String date_of_establishment;

    public String getBoss_name(){return boss_name;}
    public String getAddress(){return address;}
    public String getDate_of_establishment(){return date_of_establishment;}
    public int getEconemic_coden(){return econemic_code;}

    public void setBoss_name(String boss_name){this.boss_name=boss_name;}
    public void setAddress(String address){this.address=address;}
    public void setDate_of_establishment(String date_of_establishment){this.date_of_establishment=date_of_establishment;}
    public void setEconemic_code(int econemic_code){this.econemic_code=econemic_code;}

    //----
    String infopath="/home/alireza/Desktop/accounting_project_info/companies_info/"+name;
    String incomepath="/home/alireza/Desktop/accounting_project_info/companies_info/"+name+"/income";
    String expencepath="/home/alireza/Desktop/accounting_project_info/companies_info/"+name+"expense";

    Company(String name, String email, String phone_number, String activity_type, ArrayList<String> employee_names, int econemic_code,String boss_name, String address, String date_of_establishment) {
        super(name, email, phone_number, activity_type, employee_names);
        this.econemic_code=econemic_code;
        this.boss_name=boss_name;
        this.address=address;
        this.date_of_establishment=date_of_establishment;

        new File(incomepath).mkdirs();
        new File(incomepath,"expense").mkdir();
    }

    @Override
    public void info() throws Exception {
        File info = new File(infopath,"info.txt");
        info.createNewFile();
        Formatter fm = new Formatter(info);
        fm.format("%s %s %s %s %s %s %s %s ", "Name :" ,name,"\t| email :",email,"\t| Activity type :",activity_type,"\t| Phone Number :",phone_number);
        fm.format("%s %i %s %s %s %s %s %s ", "\nEconemic_code :" ,econemic_code,"\t| boss name :",boss_name,"\t| address :",address,"\t| Date of establishmen :",date_of_establishment);
        fm.format(" %s %s ", "\nemployee_names :" ,employee_names.toString());
        fm.flush();
        fm.close();

    }

    @Override
    public void income() {

    }
}
