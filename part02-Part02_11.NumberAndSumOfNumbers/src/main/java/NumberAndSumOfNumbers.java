
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumTotal = 0;
        int sumNumbers = 0;
        int breakProgram = 0;

        while(true){
            System.out.println("Give a number:");
            int userNumber = Integer.valueOf(scanner.nextLine());

            if(userNumber == breakProgram){
                System.out.println("Number of numbers: "+sumNumbers);
                System.out.println("Sum of the numbers: "+sumTotal);
                break;
            }
            sumTotal = sumTotal + userNumber;
            sumNumbers++;
        }

    }
}
