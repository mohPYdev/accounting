package costumer;

import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;

public class Municipality extends Costumer  {

    Receivals Receivals_pointer;
    ArrayList<Factor> factors = new ArrayList<>();
    ArrayList<Instrument> instruments = new ArrayList<>();
    ArrayList<Salary> salaries = new ArrayList<>();
    private double fund;


    private String mayor_name;
    private int region;




    Municipality(String name, String email, String phone_number
            , String activity_type, ArrayList<String> employee_names,String mayor_name,int region, double fund , Receivals Receivals_pointer ) {

        super(name, email, phone_number, activity_type, employee_names);

        this.mayor_name=mayor_name;
        this.region=region;
        this.fund=fund;
        this.Receivals_pointer = Receivals_pointer;
    }

    public String getMayor_name(){return mayor_name;}
    public double getFund(){return fund;}
    public void setMayor_name(String mayor_name){this.mayor_name=mayor_name;}
    public void setFund(double fund){this.fund=fund;}
    public int getRegion(){return region;}
    public void setRegion(int region){this.region=region;}

    public ArrayList<Salary> getSalaries() {
        return salaries;
    }

    public ArrayList<Factor> getFactors() {
        return factors;
    }

    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    public Salary getSalary(String name)
    {
        for(Salary salary : this.salaries)
        {
            if(salary.emp_name.equals(name))
                return salary;
        }

        return null;
    }

    public Receivals getReceivals_pointer() {
        return Receivals_pointer;
    }

    public void addFactor(Factor factor){ this.factors.add(factor);}
    public void addInstallment(Instrument instrument){this.instruments.add(instrument);}

    public void addSalary(Salary salary)
    {
        this.salaries.add(salary);
        super.add_employee(salary.emp_name);
    }

}
