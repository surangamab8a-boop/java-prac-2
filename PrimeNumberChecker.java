
import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        boolean isPrime = true;

        System.out.print("Enter number: ");
        number = input.nextInt();

        if (number <= 1) {
            isPrime = false;
        }

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Number is Prime.");
        } else {
            System.out.println("Number is Not Prime.");
        }

        input.close();
    }
}
