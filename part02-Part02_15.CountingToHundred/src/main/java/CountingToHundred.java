
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = Integer.valueOf(scanner.nextLine());

        while(userNumber > 100){
            userNumber = Integer.valueOf(scanner.nextLine());
        }

        for(int i=userNumber;i<=100;i++){
            System.out.println(i);
        }

    }
}
