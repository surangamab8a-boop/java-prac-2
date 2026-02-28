
import java.util.Scanner;

public class SimpleLoginSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        String username;
        String password;
        int attempts = 0;
        boolean isLoggedIn = false;

        while (attempts < 3) {

            System.out.print("Enter username: ");
            username = input.nextLine();

            System.out.print("Enter password: ");
            password = input.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                isLoggedIn = true;
                break;
            } else {
                System.out.println("Invalid credentials. Try again.");
                attempts++;
            }
        }

        if (isLoggedIn) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Account Locked!");
        }

        input.close();
    }
}
