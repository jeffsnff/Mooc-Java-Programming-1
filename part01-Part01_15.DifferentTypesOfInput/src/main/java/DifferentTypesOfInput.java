
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userString;
        int userInt;
        double userDouble;
        Boolean userBoolean;

        // Write your program here
        System.out.println("Give a string:");
        userString = scan.nextLine();
        System.out.println("Give an integer:");
        userInt = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        userDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        userBoolean = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string "+userString);
        System.out.println("You gave the integer "+userInt);
        System.out.println("You gave the double "+userDouble);
        System.out.println("You gave the boolean "+userBoolean);
    }
}
