
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        // write your program here
        System.out.println("Give the first number:");
        x = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        y = Integer.valueOf(scanner.nextLine());

        System.out.println(x+" + "+y+" = "+(x+y));
    }
}
