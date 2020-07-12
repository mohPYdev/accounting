package costumer;

import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;

public class Company extends Costumer  {

    Bill Bill_pointer;
    Factor Factor_pointer;
    Instrument Instrument_pointer;
    Product Produck_pointer;
    Salary Salary_pointer;
    Receivals Receivals_pointer;

    private int other_expence;
    private int econemic_code;
    private String boss_name;
    private String address;
    private String date_of_establishment;

    public String getBoss_name(){return boss_name;}
    public String getAddress(){return address;}
    public String getDate_of_establishment(){return date_of_establishment;}
    public int getEconemic_coden(){return econemic_code;}
    public int getOther_expence(){return other_expence;}

    public void setBoss_name(String boss_name){this.boss_name=boss_name;}
    public void setAddress(String address){this.address=address;}
    public void setDate_of_establishment(String date_of_establishment){this.date_of_establishment=date_of_establishment;}
    public void setEconemic_code(int econemic_code){this.econemic_code=econemic_code;}
    public void setOther_expence(int other_expence){this.other_expence=other_expence;}

    //----
    String infopath="/home/alireza/Desktop/accounting_project_info/companies_info/"+name;
    String incomepath="/home/alireza/Desktop/accounting_project_info/companies_info/"+name+"/income";
    String expencepath="/home/alireza/Desktop/accounting_project_info/companies_info/"+name+"expense";
    /*
  آدرسهایی که فرم بالا دارن  موقتی ان چون تو واسط گرافیکی کاربر آدرس رو انتخاب میکنه و اون آدرس باید جایگزین این بشه
    */


    Company(String name, String email, String phone_number, String activity_type, ArrayList<String> employee_names, int econemic_code,
            String boss_name, String address, String date_of_establishment,String id_bill , String price_bill , String date_bill , Bill.BillType type_bill
            ,String date_salary  , String price_salary  , String emp_name_salary,int other_expence) {
        super(name, email, phone_number, activity_type, employee_names);
        this.econemic_code=econemic_code;
        this.boss_name=boss_name;
        this.address=address;
        this.date_of_establishment=date_of_establishment;

        new File(incomepath).mkdirs();
        new File(incomepath,"expense").mkdir();

        //expence:
        Salary compamy_salary = new Salary( date_salary  ,  price_salary  , emp_name_salary );
        Bill company_bill = new Bill(id_bill ,price_bill , date_bill , type_bill);
        this.other_expence=other_expence;
        Salary_pointer=compamy_salary;
        Bill_pointer=company_bill;
    }

    @Override
    public void info_write() throws Exception {
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
    public void income_write() throws Exception {

    }

    @Override
    public void expence_write() throws Exception {
        File expence = new File(expencepath, "expence.txt");
        expence.createNewFile();
        Formatter fm = new Formatter(expence);
        fm.format("%s %s %s %s %s %s %s ", "<<Bill>>\n", "|date:",Bill_pointer.getDate(), "\t| price :", Bill_pointer.getPrice(), "\t| Type :", Bill_pointer.getType());
        fm.format("%s %s %s %s %s %s %s", "\n\n<<Salary>>\n", "|date:",Salary_pointer.getDate(), "\t| price :", Salary_pointer.getPrice(), "\t| Emp name :", Salary_pointer.getEmp_name());
        fm.format("%s %i","\n\n<<other expence>>\n",other_expence);
        fm.flush();
        fm.close();    }

    @Override
    public void income_read() throws Exception {
    //after create GUI
    }

    @Override
    public void expence_read() throws Exception {
        //after create GUI
    }

    @Override
    public void info_read() throws Exception {
//after create GUI
    }

    @Override
    public void income_write_obj() throws Exception {

    }

    @Override
    public void expence_write_obj() throws Exception {

    }

    @Override
    public void info_write_obj() throws Exception {

    }

    @Override
    public void income_read_obj() throws Exception {
//after create GUI
    }

    @Override
    public void expence_read_obj() throws Exception {
//after create GUI
    }

    @Override
    public void info_read_obj() throws Exception {
//after create GUI
    }

}
