package costumer;

import java.util.ArrayList;

public class Factor {
    public enum types{
        BUY , SALE
    }
    String ID , date  , sender , receiver;
    types type ;
    ArrayList<Product> products = new ArrayList<>();

    public Factor(String ID, String date, types type, String sender, String receiver, ArrayList<Product> products)
    {
        this.ID = ID;
        this.date = date;
        this.type = type;
        this.sender = sender;
        this.receiver = receiver;
        this.products = products;
    }


    public double getCost(){
        double cost = 0;
        for(Product product : products)
        {
            cost += Double.parseDouble(product.getPrice());
        }
        return cost;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String getSender() {
        return sender;
    }

    public String getDate() {
        return date;
    }

    public String getReceiver() {
        return receiver;
    }
}
