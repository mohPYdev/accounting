package costumer;

public class Product {

    private String name , price , value_added;

    public Product(String name, String price, String value_added)
    {
        this.name = name;
        this.price = price;
        this.value_added = value_added;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setValue_added(String value_added) {
        this.value_added = value_added;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getValue_added() {
        return value_added;
    }
}
