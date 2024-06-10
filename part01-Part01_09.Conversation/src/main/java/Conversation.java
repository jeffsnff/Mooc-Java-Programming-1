
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
      String usersDay;
      String usersReply;
      System.out.println("Greetings! How are you doing?");
      usersDay = scanner.nextLine();
      System.out.println("Oh, how interesting. Tell me more!");
      usersReply = scanner.nextLine();
      scanner.close();
      System.out.println("Thanks for sharing!");

    }
}
