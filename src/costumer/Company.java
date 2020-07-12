package costumer;

import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;

public class Company extends Costumer  {

    ArrayList<Bill> bills = new ArrayList<>();
    ArrayList<Project> projects = new ArrayList<>();
    ArrayList<Salary> salaries = new ArrayList<>();
    private int other_expence;

    private int econemic_code;
    private String boss_name;
    private String address;
    private String date_of_establishment;


    Company(String name, String email, String phone_number, String activity_type, ArrayList<String> employee_names, int econemic_code,
            String boss_name, String address, String date_of_establishment,int other_expence) {
        super(name, email, phone_number, activity_type, employee_names);
        this.econemic_code=econemic_code;
        this.boss_name=boss_name;
        this.address=address;
        this.date_of_establishment=date_of_establishment;
        this.other_expence=other_expence;
    }

    public String getBoss_name(){return boss_name;}
    public String getAddress(){return address;}
    public String getDate_of_establishment(){return date_of_establishment;}
    public int getEconemic_code() {
        return econemic_code;
    }
    public int getOther_expence() {
        return other_expence;
    }

    public Bill getBill(String id) {
        for(Bill bill : this.bills)
        {
            if(bill.id.equals(id))
                return bill;
        }
        return null;
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

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public ArrayList<Salary> getSalaries() {
        return salaries;
    }

    public void setBoss_name(String boss_name){this.boss_name=boss_name;}
    public void setAddress(String address){this.address=address;}
    public void setDate_of_establishment(String date_of_establishment){this.date_of_establishment=date_of_establishment;}
    public void setEconemic_code(int econemic_code){this.econemic_code=econemic_code;}
    public void setOther_expence(int other_expence){this.other_expence=other_expence;}
    public void addBill(Bill bill)
    {
        this.bills.add(bill);
    }
    public void addProject(Project project)
    {
        this.projects.add(project);
    }
    public void addSalary(Salary salary)
    {
        this.salaries.add(salary);
        super.add_employee(salary.emp_name);
    }













//    @Override
//    public void info_write() throws Exception {
//        File info = new File(infopath,"info.txt");
//        info.createNewFile();
//        Formatter fm = new Formatter(info);
//        fm.format("%s %s %s %s %s %s %s %s ", "Name :" ,name,"\t| email :",email,"\t| Activity type :",activity_type,"\t| Phone Number :",phone_number);
//        fm.format("%s %i %s %s %s %s %s %s ", "\nEconemic_code :" ,econemic_code,"\t| boss name :",boss_name,"\t| address :",address,"\t| Date of establishmen :",date_of_establishment);
//        fm.format(" %s %s ", "\nemployee_names :" ,employee_names.toString());
//        fm.flush();
//        fm.close();
//
//    }
//
//    @Override
//    public void income_write() throws Exception {
//
//    }
//
//    @Override
//    public void expence_write() throws Exception {
//        File expence = new File(expencepath, "expence.txt");
//        expence.createNewFile();
//        Formatter fm = new Formatter(expence);
//        fm.format("%s %s %s %s %s %s %s ", "<<Bill>>\n", "|date:",Bill_pointer.getDate(), "\t| price :", Bill_pointer.getPrice(), "\t| Type :", Bill_pointer.getType());
//        fm.format("%s %s %s %s %s %s %s", "\n\n<<Salary>>\n", "|date:",Salary_pointer.getDate(), "\t| price :", Salary_pointer.getPrice(), "\t| Emp name :", Salary_pointer.getEmp_name());
//        fm.format("%s %i","\n\n<<other expence>>\n",other_expence);
//        fm.flush();
//        fm.close();    }
//

}
