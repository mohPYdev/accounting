package costumer;

public class Bill {
    public enum BillType{
        WATER , GAS , POWER , TELEPHONE
    }

    String id , price;
    String date;  //    year/month/day
    BillType type;

    public Bill(String id, String price, String date, BillType type)
    {
        this.id = id;
        this.price = price;
        this.date = date;
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public BillType getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public String getId() {
        return id;
    }
}
