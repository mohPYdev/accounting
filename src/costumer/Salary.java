package costumer;

public class Salary {

    String date;
    String price , emp_name;

    Salary(String date , String price , String emp_name){
        this.date=  date;
        this.price = price;
        this.emp_name = emp_name;
    }

    public String getDate() {
        return date;
    }

    public String getPrice() {
        return price;
    }

    public String getEmp_name() {
        return emp_name;
    }
}
