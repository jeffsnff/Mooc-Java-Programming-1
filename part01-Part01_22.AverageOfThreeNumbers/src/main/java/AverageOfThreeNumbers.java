
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        double average;

        // Write your program here

        System.out.println("Give the first number:");
        firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        thirdNumber = Integer.valueOf(scanner.nextLine());

        average = ((double) firstNumber + secondNumber + thirdNumber )/3;

        System.out.println("The average is "+average);
    }
}
