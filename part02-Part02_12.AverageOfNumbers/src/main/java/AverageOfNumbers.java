
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breakProgram = 0;
        double totalNumbers = 0.0;
        int sumTotal = 0;
        double average = 0.00;

        while (true) {
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());

            if(userInput == breakProgram){
                average = sumTotal / totalNumbers ;
                System.out.println("Average of the numbers: "+average);
                break;
            }
            sumTotal = sumTotal + userInput;
            totalNumbers++;
        }
    }
}
