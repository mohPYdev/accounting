package costumer;

import java.util.ArrayList;

abstract public class Costumer {
    String name , email , phone_number , activity_type ;
    ArrayList<String> employee_names;
    //===
    public String Type_Of_Costumer;
    public abstract void income(Receivals Municipality_Receivals)throws Exception;
    public abstract void expence(Salary Municipality_Salary, Factor Municipality_Factor,Instrument Municipality_Instrument )throws Exception;
    public abstract void  info() throws Exception;
    //====
    Costumer(String name, String email , String phone_number , String activity_type , ArrayList<String> employee_names )
    {
        this.activity_type = activity_type;
        this.name = name;
        this.email = email;
        this. employee_names =employee_names;
        this.phone_number = phone_number;
    }

    void add_employee(String name){
        employee_names.add(name);
    }

    public String getName() {
        return name;
    }

    public String getActivity_type() {
        return activity_type;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public ArrayList<String> getEmployee_names() {
        return employee_names;
    }
}
