package graphic;

public class NoData extends Exception {

    @Override
    public String getMessage() {
        return "Error .... there isn't a facility in that name";
    }
}
