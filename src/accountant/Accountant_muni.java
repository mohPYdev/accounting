package accountant;

import costumer.*;

import java.io.File;

public class Accountant_muni implements Computation {

    String accountant_id , muni_name;
    private double cost = 0 , income = 0;

    Accountant_muni(String accountant_id , String muni_name)
    {
        this.accountant_id = accountant_id;
        this.muni_name = muni_name;
    }


    @Override
    synchronized public double costComputer(String path) throws InterruptedException {
        this.cost = 0;

// SALARIES

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + muni_name + "/Salaries");
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
                File file = new File(path + "/" + muni_name + "/Factors");
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


// INSTRUMENTS
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + muni_name + "/Instruments");
                for (File f : file.listFiles())
                {
                    try {
                        Instrument instrument = (Instrument) MAIN.READ_OBJECT(f);
                        cost += Double.parseDouble(instrument.getPrice());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        return cost;
    }

    @Override
    public double profitComputer(String path) throws InterruptedException {
        return 100 * (incomeComputer(path) - costComputer(path)) / incomeComputer(path);
    }

    @Override
    synchronized public double incomeComputer(String path) throws InterruptedException {

        income = 0;

// RECEIVES
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + muni_name +"/Attributes/receives.txt");
                try {
                    income += (Double)MAIN.READ_OBJECT(file);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

// FUND
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File(path + "/" + muni_name +"/Attributes/fund.txt");
                try {
                    income += (Double)MAIN.READ_OBJECT(file);
                } catch (Exception e) {
                    e.printStackTrace();
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
