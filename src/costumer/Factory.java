package costumer;

import java.util.ArrayList;

public class Factory extends Costumer{
    private int econemic_code;
    private int equities;
    private String boss_name;
    private String address;
    private String date_of_establishment;

    public String getBoss_name(){return boss_name;}
    public String getAddress(){return address;}
    public String getDate_of_establishment(){return date_of_establishment;}
    public int getEconemic_coden(){return econemic_code;}
    public int getEquities(){return equities;}

    public void setBoss_name(String boss_name){this.boss_name=boss_name;}
    public void setAddress(String address){this.address=address;}
    public void setDate_of_establishment(String date_of_establishment){this.date_of_establishment=date_of_establishment;}
    public void setEconemic_code(int econemic_code){this.econemic_code=econemic_code;}
    public void setEquities(int equities){this.equities=equities;}

    Factory(String name, String email, String phone_number, String activity_type, ArrayList<String> employee_names, int econemic_code,int equities,String boss_name, String address, String date_of_establishment) {
        super(name, email, phone_number, activity_type, employee_names);
        this.econemic_code=econemic_code;
        this.equities=equities;
        this.boss_name=boss_name;
        this.address=address;
        this.date_of_establishment=date_of_establishment;
    }
}
