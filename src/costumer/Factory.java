package costumer;

import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;

public class Factory extends Costumer  {


    ArrayList<Instrument> instruments = new ArrayList<>();
    ArrayList<Factor> factors_expense = new ArrayList<>();
    ArrayList<Factor> factors_income = new ArrayList<>();
    ArrayList<Bill> bills = new ArrayList<>();
    ArrayList<Salary> salaries = new ArrayList<>();

    private Receivals Receivals_pointer;
    private int econemic_code;
    private int equities;
    private String boss_name;
    private String address;
    private String date_of_establishment;
    private int fix;
    private int tax;



    Factory(String name, String email, String phone_number, String activity_type, ArrayList<String> employee_names
            , int econemic_code,int equities,String boss_name, String address, String date_of_establishment, int fix,int tax) {
        super(name, email, phone_number, activity_type, employee_names);
        this.econemic_code=econemic_code;
        this.equities=equities;
        this.boss_name=boss_name;
        this.address=address;
        this.date_of_establishment=date_of_establishment;
        this.fix=fix;
        this.tax=tax;
    }

    public String getBoss_name(){return boss_name;}
    public String getAddress(){return address;}
    public String getDate_of_establishment(){return date_of_establishment;}
    public int getEconemic_code() {
        return econemic_code;
    }

    public int getEquities(){return equities;}
    public int getFix(){return fix;}
    public int getTax(){return tax;}

    public Receivals getReceivals_pointer() {
        return Receivals_pointer;
    }

    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    public ArrayList<Salary> getSalaries() {
        return salaries;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public ArrayList<Factor> getFactors_expense() {
        return factors_expense;
    }

    public ArrayList<Factor> getFactors_income() {
        return factors_income;
    }


    public void setBoss_name(String boss_name){this.boss_name=boss_name;}
    public void setAddress(String address){this.address=address;}
    public void setDate_of_establishment(String date_of_establishment){this.date_of_establishment=date_of_establishment;}
    public void setEconemic_code(int econemic_code){this.econemic_code=econemic_code;}
    public void setEquities(int equities){this.equities=equities;}
    public void setTax(int tax){this.tax=tax;}
    public void setFix(int fix){this.fix=fix;}

    public void addExpenseFactor(Factor factor){ this.factors_expense.add(factor);}
    public void addIncomeFactor(Factor factor){ this.factors_income.add(factor);}
    public void addInstallment(Instrument instrument){this.instruments.add(instrument);}

    public void addSalary(Salary salary)
    {
        this.salaries.add(salary);
        super.add_employee(salary.emp_name);
    }




//    public void info() throws Exception {
//        File info = new File(infopath,"info.txt");
//        info.createNewFile();
//        Formatter fm = new Formatter(info);
//        fm.format("%s %s %s %s %s %s %s %s ", "Name :" ,name,"\t| email :",email,"\t| Activity type :",activity_type,"\t| Phone Number :",phone_number);
//        fm.format("%s %i %s %s %s %s %s %s ", "\nEconemic_code :" ,econemic_code,"\t| boss name :",boss_name,"\t| address :",address,"\t| Date of establishmen :",date_of_establishment);
//        fm.format(" %s %s ", "\nemployee_names :" ,employee_names.toString());
//        fm.flush();
//        fm.close();
//    }
//
//
//    public void income() throws Exception {
//
//    }
//
//
//    public void expence() throws Exception {
//        File expence = new File(expencepath, "expence.txt");
//        expence.createNewFile();
//        Formatter fm = new Formatter(expence);
//        fm.format("%s %s %s %s %s %s %s ", "<<Bill>>\n", "|date:",Bill_pointer.getDate(), "\t| price :", Bill_pointer.getPrice(), "\t| Type :", Bill_pointer.getType());
//        fm.format("%s %s %s %s %s %s %s", "\n\n<<Salary>>\n", "|date:",Salary_pointer.getDate(), "\t| price :", Salary_pointer.getPrice(), "\t| Emp name :", Salary_pointer.getEmp_name());
//        fm.format("%s %s %s %s %s %s %s %s %s", "\n\n<<Factor_expence>>\n", "|ID:", Factor_expence_pointer.ID, "\t| date :", Factor_expence_pointer.date, "\t| receiver :", Factor_expence_pointer.receiver,"\t| sender :", Factor_expence_pointer.sender);
//        fm.format("%s %i","\n\n<<Fix>>\n",fix);
//        fm.format("%s %i","\n\n<<Tax>>\n",tax);
//        fm.flush();
//        fm.close();
//    }
}
