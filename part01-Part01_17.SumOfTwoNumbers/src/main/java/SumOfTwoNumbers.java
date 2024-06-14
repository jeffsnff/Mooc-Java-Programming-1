
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        int num1;
        int num2;
        int answer;
        System.out.println("Give the first number:");
        num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        num2 = Integer.valueOf(scanner.nextLine());

        answer = num1 + num2;

        System.out.println("The sum of the numbers is "+answer);
    }
}
