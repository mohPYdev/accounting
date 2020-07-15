package costumer;

public class Project {

    private String activity_kind , price , date , name;

    public Project(String activity_kind, String price, String date, String name)
    {
        this.activity_kind = activity_kind;
        this.price = price;
        this.date = date;
        this.name = name;
    }

    public String getActivity_kind() {
        return activity_kind;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setActivity_kind(String activity_kind) {
        this.activity_kind = activity_kind;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
