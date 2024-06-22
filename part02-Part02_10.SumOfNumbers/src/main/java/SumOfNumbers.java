
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int breakProgram = 0;

        while(true){
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if(userInput == breakProgram){
                System.out.println("Sum of the numbers: "+total);
                break;
            }

            total = total + userInput;
        }
    }
}
