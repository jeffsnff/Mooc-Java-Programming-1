
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userSpeed;
        // Write your program here. 
        System.out.println("Give speed:");
        userSpeed = Integer.valueOf(scanner.nextLine());
        if(userSpeed > 120){
          System.out.println("Speeding ticket!");
        }
        scanner.close();
    }
}
