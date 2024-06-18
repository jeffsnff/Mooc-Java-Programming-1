
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        int userNumber;
        System.out.println("Give a number:");
        userNumber = Integer.valueOf(scan.nextLine());
        if(userNumber==1984){
            System.out.println("Orwell");
        }
    }
}
