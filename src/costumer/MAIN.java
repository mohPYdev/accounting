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
}

interface acci
{
    public void info(String infopath) throws Exception;
    public void income(String infcomepath);

}