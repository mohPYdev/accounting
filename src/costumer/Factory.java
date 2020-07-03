package costumer;

import java.util.ArrayList;

public class Factory extends Costumer{

    Factory(String name, String email, String phone_number, String activity_type, ArrayList<String> employee_names) {
        super(name, email, phone_number, activity_type, employee_names);
    }
}
