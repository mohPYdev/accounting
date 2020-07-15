package costumer;

public class Instrument {

    String date , price;
    String side1_name , side2_name;

    public Instrument(String date, String price, String side1_name, String side2_name)
    {
        this.date = date;
        this.price=  price;
        this.side1_name = side1_name;
        this.side2_name = side2_name;
    }

    public String getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public String getSide1_name() {
        return side1_name;
    }

    public String getSide2_name() {
        return side2_name;
    }
}
