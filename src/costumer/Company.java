package costumer;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Formatter;

public class Company extends Costumer implements Serializable {

    ArrayList<Bill> bills = new ArrayList<>();
    ArrayList<Project> projects = new ArrayList<>();
    ArrayList<Salary> salaries = new ArrayList<>();
    private double other_expence;
    private double investment;
    private int econemic_code;
    private String boss_name;
    private String address;
    private String date_of_establishment;


    public Company(String name, String email, String phone_number, String activity_type, ArrayList<String> employee_names, int econemic_code,
                   String boss_name, String address, String date_of_establishment, double other_expence, double investment) {
        super(name, email, phone_number, activity_type, employee_names);
        this.econemic_code = econemic_code;
        this.boss_name = boss_name;
        this.address = address;
        this.date_of_establishment = date_of_establishment;
        this.other_expence = other_expence;
        this.investment = investment;
    }

    public String getBoss_name() {
        return boss_name;
    }

    public String getAddress() {
        return address;
    }

    public String getDate_of_establishment() {
        return date_of_establishment;
    }

    public int getEconemic_code() {
        return econemic_code;
    }

    public double getOther_expence() {
        return other_expence;
    }

    public double getInvestment() {
        return investment;
    }

    public Bill getBill(String id) {
        for (Bill bill : this.bills) {
            if (bill.id.equals(id))
                return bill;
        }
        return null;
    }

    public Salary getSalary(String name) {
        for (Salary salary : this.salaries) {
            if (salary.emp_name.equals(name))
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

    public void setBoss_name(String boss_name) {
        this.boss_name = boss_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDate_of_establishment(String date_of_establishment) {
        this.date_of_establishment = date_of_establishment;
    }

    public void setEconemic_code(int econemic_code) {
        this.econemic_code = econemic_code;
    }

    public void setOther_expence(double other_expence) {
        this.other_expence = other_expence;
    }

    public void addBill(Bill bill) {
        this.bills.add(bill);
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }

    public void addSalary(Salary salary) {
        this.salaries.add(salary);
        super.add_employee(salary.emp_name);
    }
}
