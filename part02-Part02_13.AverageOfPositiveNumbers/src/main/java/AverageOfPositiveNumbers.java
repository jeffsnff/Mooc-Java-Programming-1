
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double positiveNumberEntered = 0.0;
        int sumPostive = 0;
        int breakProgram = 0;
        double averagePostive = 0.0;

        while (true) {
            int userNumber = Integer.valueOf(scanner.nextLine());

            if(userNumber == breakProgram){
                if(positiveNumberEntered == 0){
                    System.out.println("Cannot calculate the average");
                    break;
                }else{
                    averagePostive = sumPostive / positiveNumberEntered;
                    System.out.println(averagePostive);
                    break;
                }
            }

            if(userNumber > 0){
                sumPostive = sumPostive + userNumber;
                positiveNumberEntered++;
            }
        }
    }
}
