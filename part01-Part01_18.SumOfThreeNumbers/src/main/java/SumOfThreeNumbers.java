
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int answer;
        // Write your program here
        System.out.println("Give the first number:");
        firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        thirdNumber = Integer.valueOf(scanner.nextLine());

        answer = firstNumber + secondNumber + thirdNumber;

        System.out.println("The sum of the numbers is "+answer);


    }
}
