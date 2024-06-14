
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        double average;
        // Write your program here

        System.out.println("Give the first number:");
        firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        secondNumber = Integer.valueOf(scanner.nextLine());

        average = ((double) firstNumber + secondNumber)/2;

        System.out.println("The average is "+average);

    }
}
