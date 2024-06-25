
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Second number?");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int total = 0;

        for(int i=firstNumber; i<=secondNumber; i++){
            total = total + i;
        }

        System.out.println(total);
        

    }
}
