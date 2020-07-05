package costumer;

import java.util.ArrayList;

public class Municipality extends Costumer{

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
    }
}
