
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int breakLoop = 4;

            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());

            if(userInput == breakLoop){
                break;
            }
            System.out.println(userInput);
        }
    }
}
