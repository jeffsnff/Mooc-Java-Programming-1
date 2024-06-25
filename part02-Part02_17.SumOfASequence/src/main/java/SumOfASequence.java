
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int userInput = Integer.valueOf(scanner.nextLine());
        int total = 0;

        for(int i=1;i<=userInput;i++){
            total = total + i;
        }
        System.out.println(total);
    }
}
