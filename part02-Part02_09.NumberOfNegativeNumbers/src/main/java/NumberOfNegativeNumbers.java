
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNeg = 0;
        int breakProgram = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == breakProgram) {
                System.out.println("Number of negative numbers: "+numNeg);
                break;
            }
            if (userNum < 0) {
                numNeg++;
            }
        }
    }
}
