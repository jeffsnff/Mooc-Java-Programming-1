
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber;
        int compare = 0;
        // Write your program here
        System.out.println("Give a number");
        userNumber = Integer.valueOf(scan.nextLine());
        scan.close();
        if(userNumber > compare){
            System.out.println("The number is positive");
        }else{
            System.out.println("The number is not positive");
        }
    }
}
