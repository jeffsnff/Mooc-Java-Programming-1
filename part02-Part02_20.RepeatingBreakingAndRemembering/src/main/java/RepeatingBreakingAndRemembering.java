
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int breakProgram = -1;
        int sumNumbers = 0;
        int numPositive = 0;
        double average = 0.0;
        int evenNum = 0;
        int oddNum = 0;

        while(true){
            System.out.println("Give Numbers:");
            int userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == breakProgram){
                break;
            }

            if(userInput != breakProgram ){
                sumNumbers = sumNumbers + userInput;
                numPositive++;
            }

            if(userInput%2 == 0){
                evenNum++;
                continue;
            }else{
                oddNum++;
                continue;
            }
        }

        average = sumNumbers / (double)numPositive;
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sumNumbers);
        System.out.println("Numbers: "+numPositive);
        System.out.println("Average: "+average);
        System.out.println("Even: "+evenNum);
        System.out.println("Odd: "+oddNum);
    }
}
