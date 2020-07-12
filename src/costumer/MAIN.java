package costumer;

import java.io.File;

public class MAIN {
    public static void main(String[] args) {

        new File("/home/alireza/Desktop","accounting_project_info").mkdir();
        new File("/home/alireza/Desktop/accounting_project_info","companies_info").mkdir();
        new File("/home/alireza/Desktop/accounting_project_info","municipalities_info").mkdir();
        new File("/home/alireza/Desktop/accounting_project_info","factories_info").mkdir();
        /*
        آدرسهایی که فرم بالا دارن . موقتی ان چون تو واسط گرافیکی کاربر آدرس رو انتخاب میکنه و اون آدرس باید جایگزین این بشه
         */

    }
    // for 4 methods
    static <T extends  Costumer>void READ_OBJECT(T cf) throws Exception
    {
        cf.info_read_obj();
        cf.income_read_obj();
        cf.expence_read_obj();
    }

    static <T extends  Costumer>void WRITE_OBJECT(T cf) throws Exception
    {
        cf.info_write_obj();
        cf.income_write_obj();
        cf.expence_write_obj();
    }

    static <T extends  Costumer>void READ(T cf) throws Exception
    {
        cf.info_read();
        cf.income_read();
        cf.expence_read();
    }

    static <T extends  Costumer>void WRITE(T cf) throws Exception
    {
        cf.info_write_obj();
        cf.income_write_obj();
        cf.expence_write_obj();
    }
}
