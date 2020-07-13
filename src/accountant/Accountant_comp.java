package accountant;

import com.sun.tools.javac.Main;
import costumer.*;

import java.io.File;
import java.lang.reflect.Field;

public class Accountant_comp implements Computation {

    String Accountant_id , comp_name;
    private double cost = 0;
    private double income = 0;

    Accountant_comp(String Accountant_id , String comp_name){
        this.Accountant_id = Accountant_id;
        this.comp_name = comp_name;
    }


    @Override
    public double costComputer(String path) {
        this.cost = 0;

// SALARIES

        new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + comp_name + "/Salaries");
                for (File f : file.listFiles())
                {
                    try {
                        Salary salary = (Salary)MAIN.READ_OBJECT(f);
                        cost += Double.parseDouble(salary.getPrice());

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

// BILLS
        new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + comp_name + "/Bills");
                for (File f : file.listFiles())
                {
                    try {
                        Bill bill = (Bill) MAIN.READ_OBJECT(f);
                        cost += Double.parseDouble(bill.getPrice());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


// OTHERS
        new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + comp_name +"/Attributes/other_expenses.txt");
                try {
                    cost += (Double)MAIN.READ_OBJECT(file);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        return cost;
    }

    @Override
    public double profitComputer(String path) {
         return 100 * ((incomeComputer(path) - costComputer(path)) / incomeComputer(path));
    }

    @Override
    public double incomeComputer(String path) {
        this.income = 0;

// PROJECTS

        new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + comp_name + "/Projects");
                for (File f : file.listFiles())
                {
                    try {
                        Project project = (Project) MAIN.READ_OBJECT(f);
                        income += Double.parseDouble(project.getPrice());

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

// OTHERS
        new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + comp_name +"/Attributes/investments.txt");
                try {
                    income += (Double)MAIN.READ_OBJECT(file);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        return income;
    }
}
