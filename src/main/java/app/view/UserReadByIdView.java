package app.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserReadByIdView {
    public Map<String, String> getData() {
        Scanner input = new Scanner(System.in);
        Map<String, String> data = new HashMap<>();
        System.out.print("Enter contact's ID: ");
        data.put("id", input.nextLine().trim());
        return data;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
