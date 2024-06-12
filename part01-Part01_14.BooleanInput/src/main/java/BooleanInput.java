
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean userInput;
        // write your program here
        System.out.println("Write something:");
        userInput = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? "+userInput);
    }
}
