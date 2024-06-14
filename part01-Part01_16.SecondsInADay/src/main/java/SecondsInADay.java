
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        int seconds = 60;
        int minutes = 60;
        int hours = 24;
        int secondsDay;
        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        userNumber = Integer.valueOf(scanner.nextLine());
        secondsDay = hours * minutes * seconds * userNumber;
        System.out.println(secondsDay);
    }
}
