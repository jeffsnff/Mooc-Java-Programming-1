
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stringOne;
        String stringTwo;

        System.out.println("Enter the first string:");
        stringOne = scan.nextLine();
        System.out.println("Enter the second string:");
        stringTwo = scan.nextLine();

        if(stringOne.equals(stringTwo)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
