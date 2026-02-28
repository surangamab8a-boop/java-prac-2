
import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int limit;
        boolean isEven;

        System.out.print("Enter limit: ");
        limit = input.nextInt();

        for (int number = 1; number <= limit; number++) {

            isEven = (number % 2 == 0);

            if (!isEven) {
                continue;
            }

            System.out.println("Even Number: " + number);

            if (number == 20) {
                break;
            }
        }

        input.close();
    }
}
