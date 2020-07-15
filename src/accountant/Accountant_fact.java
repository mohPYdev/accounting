package accountant;

import costumer.*;

import java.io.File;

public class Accountant_fact implements Computation{

    String accountant_id , fact_name;
    double cost = 0 , income = 0;

    public Accountant_fact(String accountant_id, String fact_name)
    {
        this.accountant_id = accountant_id;
        this.fact_name = fact_name;
    }


    @Override
    public double costComputer(String path) throws InterruptedException {
        this.cost = 0;

// SALARIES

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + fact_name + "/Salaries");
                for (File f : file.listFiles())
                {
                    try {
                        Salary salary = (Salary) MAIN.READ_OBJECT(f);
                        cost += Double.parseDouble(salary.getPrice());

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

// FACTORS
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + fact_name + "/Factors_expense");
                for (File f : file.listFiles())
                {
                    try {
                        Factor factor = (Factor) MAIN.READ_OBJECT(f);
                        cost += factor.getCost();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });


// BILLS
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + fact_name + "/Bills");
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
        });

// FIXES & TAXES
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + fact_name+"/Attributes/fixes.txt");
                try {
                    cost += (Double)MAIN.READ_OBJECT(file);
                } catch (Exception ignored) {

                }
            }
        });

        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + fact_name +"/Attributes/taxes.txt");
                try {
                    cost += (Double)MAIN.READ_OBJECT(file);
                } catch (Exception ignored) {
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        return cost;
    }

    @Override
    public double profitComputer(String path) {
        return 0;
    }

    @Override
    public double incomeComputer(String path) throws InterruptedException {
        // FACTORS
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + fact_name + "/Factors_income");
                for (File f : file.listFiles())
                {
                    try {
                        Factor factor = (Factor) MAIN.READ_OBJECT(f);
                        income += factor.getCost();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

// INSTRUMENTS
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + fact_name + "/Instruments");
                for (File f : file.listFiles())
                {
                    try {
                        Instrument instrument = (Instrument) MAIN.READ_OBJECT(f);
                        income += Double.parseDouble(instrument.getPrice());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        return income;
    }
}
