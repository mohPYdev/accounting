package costumer;

public class Receivals  {
    private String ID , date  , reason ;
    private int cost;

    public void setID(String ID){this.ID=ID;}
    public void setDate(String date){this.date=date;}
    public void setReason(String reason){this.reason=reason;}
    public void setCost(int cost){this.cost=cost;}

    public String getID(){return ID;}
    public String getDate(){return date;}
    public String getReason(){return reason;}
    public int getCost(){return cost;}

    public Receivals(String ID, String date, String reason, int cost)
    {
        this.ID = ID;
        this.date = date;
        this.reason = reason;
        this.cost = cost;
    }

}
