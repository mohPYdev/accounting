package costumer;

import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;

public class Municipality extends Costumer {

    Factor Factor_pointer;
    Instrument Instrument_pointer;
    Salary Salary_pointer;
    Receivals Receivals_pointer;


    private String mayor_name;
    private int region;
    private int fund;

    public String getMayor_name(){return mayor_name;}
    public int getFund(){return region;}
    public void setMayor_name(String mayor_name){this.mayor_name=mayor_name;}
    public void setFund(int region){this.region=region;}
    public int getRegion(){return region;}
    public void setRegion(int region){this.region=region;}

    String infopath="/home/alireza/Desktop/accounting_project_info/municipalities_info/"+name;
    String incomepath="/home/alireza/Desktop/accounting_project_info/municipalities_info/"+name+"/income";
    String expencepath="/home/alireza/Desktop/accounting_project_info/municipalities_info/"+name+"expense";
    /*
            آدرسهایی که فرم بالا دارن . موقتی ان چون تو واسط گرافیکی کاربر آدرس رو انتخاب میکنه و اون آدرس باید جایگزین این بشه
    */

    Municipality(String name, String email, String phone_number
            , String activity_type, ArrayList<String> employee_names,String mayor_name,int region,
                 String date_Instrument , String price_Instrument , String side1_name_Instrument , String side2_name_Instrument,
                 String ID_Factor, String date_Factor , Factor.types type_Factor , String sender_Factor ,String receiver_Factor , ArrayList<Product> products_Factor
            ,String date_Salary , String price_Salary , String emp_name_Salary,String ID_Receivals, String date_Receivals , String reason_Receivals ,int cost_Receivals,
                 int fund) {

        super(name, email, phone_number, activity_type, employee_names);

        this.mayor_name=mayor_name;
        this.region=region;

        new File(incomepath).mkdirs();
        new File(incomepath,"expense").mkdir();

        //income:
        this.fund=fund;
        Receivals Municipality_Receivals=new Receivals( ID_Receivals, date_Receivals ,  reason_Receivals , cost_Receivals);
        //expence:
        Instrument Municipality_Instrument = new Instrument(date_Instrument , price_Instrument , side1_name_Instrument , side2_name_Instrument);
        Factor Municipality_Factor = new Factor(ID_Factor, date_Factor ,  type_Factor , sender_Factor ,receiver_Factor , products_Factor);
        Salary Municipality_Salary=new Salary(date_Salary , price_Salary , emp_name_Salary);


        Receivals_pointer=Municipality_Receivals;
        Instrument_pointer=Municipality_Instrument;
        Factor_pointer=Municipality_Factor;
        Salary_pointer=Municipality_Salary;
    }

    @Override
    public void info_write() throws Exception {
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
    public void income_write()throws Exception {
        File income = new File(incomepath, "income.txt");
        income.createNewFile();
        Formatter fm = new Formatter(income);
        fm.format("%s %i","<<fund>>\n",fund);
        fm.format("%s %s %s %s %s %s %s %s %i", "\n\n<<Receivals>>\n", "|ID:", Receivals_pointer.getID(), "\t| Date :", Receivals_pointer.getDate(), "\t| Reason :", Receivals_pointer.getReason(),"\t| cost:", Receivals_pointer.getCost());
        fm.flush();
        fm.close();
    }

    @Override
    public void expence_write( )throws Exception {
        File expence = new File(expencepath, "expence.txt");
        expence.createNewFile();
        Formatter fm = new Formatter(expence);
        fm.format("%s %s %s %s %s %s %s %s %s", "<<Instrument>>\n", "|date:",Instrument_pointer.getDate(), "\t| price :", Instrument_pointer.getPrice(), "\t| Side1 name :", Instrument_pointer.getSide1_name(),"\t| Side2 name :", Instrument_pointer.getSide2_name());
        fm.format("%s %s %s %s %s %s %s", "\n\n<<Salary>>\n", "|date:",Salary_pointer.getDate(), "\t| price :", Salary_pointer.getPrice(), "\t| Emp name :", Salary_pointer.getEmp_name());
        fm.format("%s %s %s %s %s %s %s %s %s", "\n\n<<Factor>>\n", "|ID:", Factor_pointer.ID, "\t| date :", Factor_pointer.date, "\t| receiver :", Factor_pointer.receiver,"\t| sender :", Factor_pointer.sender);
        fm.flush();
        fm.close();
    }

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
    public void info_read_obj() throws Exception  {
    //after create GUI
    }

}
