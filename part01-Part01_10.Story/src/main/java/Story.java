
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        String name;
        String career;

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        name = scanner.nextLine();
        System.out.println("What is their job?");
        career = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+ name +", who was "+ career +".");
        System.out.println("On the way to work, "+ name +" reflected on life.");
        System.out.println("Perhaps "+ name +" will not be "+ career +" forever.");
    }
}
