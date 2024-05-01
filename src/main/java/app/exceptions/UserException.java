package app.exceptions;

import java.util.HashMap;
import java.util.Map;

public class UserException extends RuntimeException {

    Map<String, String> errors;

    public UserException(String message, Map<String, String> errors) {
        super(message);
        this.errors = errors;
    }

    public String getErrors(Map<String, String> errors) {
        this.errors = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        errors.forEach((key, value) ->
                sb.append("\n>> ")
                        .append(key)
                        .append(": ")
                        .append(value)

        );
        return sb.toString();
    }
}
