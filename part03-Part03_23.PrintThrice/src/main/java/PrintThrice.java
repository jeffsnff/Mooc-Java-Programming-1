
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word: ");
        String userInput = scanner.nextLine();

        for(int count=0; count<3; count++){
            System.out.print(userInput);
        }
    }
}
