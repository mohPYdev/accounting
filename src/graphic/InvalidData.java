package graphic;

public class InvalidData extends Exception {
    @Override
    public String getMessage() {
        return "Error .... you can't add this feature to this facility!!";
    }
}
