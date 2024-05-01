package app.entity;

import java.util.Map;

public class UserMapper {

    public User mapUserData(Map<String, String> data) {
        User user = new User();
        if (data.containsKey("id"))
            user.setId(Long.parseLong(data.get("id")));
        if (data.containsKey("user_name"))
            user.setUserName(data.get("user_name"));
        if (data.containsKey("user_email"))
            user.setUserEmail(data.get("user_email"));
        return user;
    }
}
