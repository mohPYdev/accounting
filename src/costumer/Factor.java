package costumer;

import java.util.ArrayList;

public class Factor {
    enum types{
        BUY , SALE
    }
    String ID , date  , sender , receiver;
    types type ;
    ArrayList<Product> products = new ArrayList<>();

    Factor(String ID, String date , types type , String sender ,String receiver , ArrayList<Product> products)
    {
        this.ID = ID;
        this.date = date;
        this.type = type;
        this.sender = sender;
        this.receiver = receiver;
        this.products = products;
    }

}
