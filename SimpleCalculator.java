
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number1;
        double number2;
        double result = 0;
        char operator;

        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        switch (operator) {

            case '+':
                result = number1 + number2;
                break;

            case '-':
                result = number1 - number2;
                break;

            case '*':
                result = number1 * number2;
                break;

            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Division by zero not allowed.");
                    return;
                }
                break;

            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("Result: " + result);

        input.close();
    }
}
