
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int marks;
        boolean isPass;

        System.out.print("Enter student marks: ");
        marks = input.nextInt();

        isPass = marks >= 40;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } 
        else if (marks >= 75) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 60) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 40) {
            System.out.println("Grade: C");
        } 
        else {
            System.out.println("Grade: F");
        }

        if (isPass) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        input.close();
    }
}
