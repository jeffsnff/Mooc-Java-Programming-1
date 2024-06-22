
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNumber = 0;
        int breakProgram = 0;

        while(true){
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());

            if(userInput == breakProgram){
                break;
            }

            numNumber = numNumber + 1;
        }
        System.out.println("Number of numbers: "+numNumber);
    }
}
