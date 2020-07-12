package costumer;

import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;

public class Factory extends Costumer  {

    Bill Bill_pointer;
    Factor Factor_expence_pointer;
    Factor Factor_income_pointer;
    Instrument Instrument_pointer;
    Product Produck_pointer;
    Salary Salary_pointer;
    Receivals Receivals_pointer;


    private int econemic_code;
    private int equities;
    private String boss_name;
    private String address;
    private String date_of_establishment;
    private int fix;
    private int tax;

    public String getBoss_name(){return boss_name;}
    public String getAddress(){return address;}
    public String getDate_of_establishment(){return date_of_establishment;}
    public int getEconemic_coden(){return econemic_code;}
    public int getEquities(){return equities;}
    public int getFix(){return fix;}
    public int getTax(){return tax;}

    public void setBoss_name(String boss_name){this.boss_name=boss_name;}
    public void setAddress(String address){this.address=address;}
    public void setDate_of_establishment(String date_of_establishment){this.date_of_establishment=date_of_establishment;}
    public void setEconemic_code(int econemic_code){this.econemic_code=econemic_code;}
    public void setEquities(int equities){this.equities=equities;}
    public void setTax(int tax){this.tax=tax;}
    public void setFix(int fix){this.fix=fix;}

    //---
    String infopath="/home/alireza/Desktop/accounting_project_info/factories_info/"+name;
    String incomepath="/home/alireza/Desktop/accounting_project_info/factories_info/"+name+"/income";
    String expencepath="/home/alireza/Desktop/accounting_project_info/factories_info/"+name+"expense";

    Factory(String name, String email, String phone_number, String activity_type, ArrayList<String> employee_names, int econemic_code,int equities,String boss_name, String address, String date_of_establishment,
            String ID_expence_Factor, String date_expence_Factor , Factor.types type_expence_Factor , String sender_expence_Factor ,String receiver_expence_Factor , ArrayList<Product> products_expence_Factor
            ,String id_bill , String price_bill , String date_bill , Bill.BillType type_bill,String date_Salary , String price_Salary , String emp_name_Salary,int fix,int tax) {
        super(name, email, phone_number, activity_type, employee_names);
        this.econemic_code=econemic_code;
        this.equities=equities;
        this.boss_name=boss_name;
        this.address=address;
        this.date_of_establishment=date_of_establishment;

        new File(incomepath).mkdirs();
        new File(incomepath,"expense").mkdir();

        //expence
        Factor Factory_expence_Factor = new Factor(ID_expence_Factor, date_expence_Factor , type_expence_Factor , sender_expence_Factor ,receiver_expence_Factor ,  products_expence_Factor);
        Bill Factory_bill=new Bill(id_bill , price_bill , date_bill ,  type_bill);
        Salary Factory_Salary =new  Salary(date_Salary , price_Salary , emp_name_Salary);
        this.fix=fix;
        this.tax=tax;
        Factor_expence_pointer=Factory_expence_Factor;
        Bill_pointer=Factory_bill;
        Salary_pointer=Factory_Salary;
        //
    }



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


    public void income() throws Exception {

    }


    public void expence() throws Exception {
        File expence = new File(expencepath, "expence.txt");
        expence.createNewFile();
        Formatter fm = new Formatter(expence);
        fm.format("%s %s %s %s %s %s %s ", "<<Bill>>\n", "|date:",Bill_pointer.getDate(), "\t| price :", Bill_pointer.getPrice(), "\t| Type :", Bill_pointer.getType());
        fm.format("%s %s %s %s %s %s %s", "\n\n<<Salary>>\n", "|date:",Salary_pointer.getDate(), "\t| price :", Salary_pointer.getPrice(), "\t| Emp name :", Salary_pointer.getEmp_name());
        fm.format("%s %s %s %s %s %s %s %s %s", "\n\n<<Factor_expence>>\n", "|ID:", Factor_expence_pointer.ID, "\t| date :", Factor_expence_pointer.date, "\t| receiver :", Factor_expence_pointer.receiver,"\t| sender :", Factor_expence_pointer.sender);
        fm.format("%s %i","\n\n<<Fix>>\n",fix);
        fm.format("%s %i","\n\n<<Tax>>\n",tax);
        fm.flush();
        fm.close();
    }
}
