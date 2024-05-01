package app.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserCreateView {
    public Map<String, String> getData() {
        Scanner input = new Scanner(System.in);
        Map<String, String> data = new HashMap<>();
        System.out.print("Enter user name: ");
        data.put("user_name", input.nextLine().trim());
        System.out.print("Enter user email in format example@mail.com: ");
        data.put("user_email", input.nextLine().trim());
        return data;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
