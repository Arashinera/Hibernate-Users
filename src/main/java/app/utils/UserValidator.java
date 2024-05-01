package app.utils;

import java.util.HashMap;
import java.util.Map;

public class UserValidator {

    public Map<String, String> validateUserData(Map<String, String> data) {

        Map<String, String> errors = new HashMap<>();

        if (data.containsKey("id") & AppValidator.isIdValid(data.get("id")))
            errors.put("id", Constants.WRONG_ID_MSG);

        if (data.containsKey("user_name")) {
            if (data.get("user_name") != null & data.get("user_name").isEmpty())
                errors.put("user name", Constants.INPUT_REQ_MSG);
        }

        if (data.containsKey("email") & AppValidator.isEmailValid(data.get("email")))
            errors.put("email", Constants.WRONG_EMAIL_MSG);

        return errors;
    }
}
