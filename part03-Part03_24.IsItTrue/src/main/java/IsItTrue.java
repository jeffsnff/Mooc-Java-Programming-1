
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String userInput = scanner.nextLine();
        String stringCompare = "true";

        if(userInput.equals(stringCompare)){
            System.out.println("You got it right!");
        }else{
            System.out.println("Try again!");
        }
    }
}
