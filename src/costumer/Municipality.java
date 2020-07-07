package costumer;

import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;

public class Municipality extends Costumer implements acci{

    private String mayor_name;
    private int region;

    public String getMayor_name(){return mayor_name;}
    public int getRegion(){return region;}
    public void setMayor_name(String mayor_name){this.mayor_name=mayor_name;}
    public void setRegion(int region){this.region=region;}

    Municipality(String name, String email, String phone_number
            , String activity_type, ArrayList<String> employee_names,String mayor_name,int region) {

        super(name, email, phone_number, activity_type, employee_names);

        this.mayor_name=mayor_name;
        this.region=region;

        new File("/home/alireza/Desktop/accounting_project_info/municipalities_info/"+name+"/income").mkdirs();
        new File("/home/alireza/Desktop/accounting_project_info/municipalities_info/"+name,"expense").mkdir();

    }

    @Override
    public void info(String infopath) throws Exception {
        File info = new File(infopath, "info.txt");
        info.createNewFile();
        Formatter fm = new Formatter(info);
        fm.format("%s %s %s %s %s %s %s %s ", "Name :", name, "\t| email :", email, "\t| Activity type :", activity_type, "\t| Phone Number :", phone_number);
        fm.format("%s %s %s %i ", "\n Mayor name :", mayor_name, "\t| region :", region);
        fm.format(" %s %s ", "\nemployee_names :", employee_names.toString());
        fm.flush();
        fm.close();
    }

    @Override
    public void income(String infcomepath) {

    }
}
