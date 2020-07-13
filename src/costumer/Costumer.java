package costumer;

import java.io.Serializable;
import java.util.ArrayList;

abstract public class Costumer implements Serializable {
    String name , email , phone_number , activity_type ;
    ArrayList<String> employee_names;

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
