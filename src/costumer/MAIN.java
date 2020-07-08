package costumer;

import java.io.File;

public class MAIN {
    public static void main(String[] args) {

        new File("/home/alireza/Desktop","accounting_project_info").mkdir();
        new File("/home/alireza/Desktop/accounting_project_info","companies_info").mkdir();
        new File("/home/alireza/Desktop/accounting_project_info","municipalities_info").mkdir();
        new File("/home/alireza/Desktop/accounting_project_info","factories_info").mkdir();

    }
    // for 4 methods
    static void m1(Costumer cf) throws Exception
    {
            cf.info();
            cf.income();
            cf.expence();
    }
}
