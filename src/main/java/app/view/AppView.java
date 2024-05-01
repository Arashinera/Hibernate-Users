package app.view;

import app.utils.AppStarter;
import app.utils.Constants;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppView {

    Scanner input;
    int choice;

    public int chooseOption() {
        input = new Scanner(System.in);
        showMenu();
        try {
            choice = input.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println(Constants.INCORRECT_OPTION_MSG);
            AppStarter.startApp();
        }
        return choice;
    }

    private void showMenu() {
        System.out.print("""
                
                ______ MENU ___________
                1 - Create user.
                2 - Read users.
                3 - Update user.
                4 - Delete user.
                5 - Read user by id.
                0 - Close the App.
                """);
        System.out.print("Input option: ");
    }

    public void getOutput(String output) {
        if (output.equals("0")) {
            System.out.println(Constants.APP_CLOSE_MSG);
            System.exit(0);
        } else System.out.println(output);
    }
}
