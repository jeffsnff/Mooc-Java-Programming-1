
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String userName = scanner.nextLine();
        scanner.close();
        System.out.println("Hi "+userName);

        // Write your program here

    }
}
