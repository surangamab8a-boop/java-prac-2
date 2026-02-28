
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int counter = 1;

        System.out.print("Enter number: ");
        number = input.nextInt();

        while (counter <= 10) {

            int result = number * counter;
            System.out.println(number + " x " + counter + " = " + result);

            counter++;
        }

        input.close();
    }
}
