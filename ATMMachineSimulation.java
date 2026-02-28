
import java.util.Scanner;

public class ATMMachineSimulation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 10000.0;
        int choice;
        boolean exit = false;

        while (!exit) {

            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = input.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Amount Deposited Successfully.");
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = input.nextDouble();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Please collect cash.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}
