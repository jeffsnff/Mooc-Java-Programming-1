
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double userInput;
        // write your program here
        System.out.println("Give a number:");
        userInput = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number "+userInput);

    }
}
