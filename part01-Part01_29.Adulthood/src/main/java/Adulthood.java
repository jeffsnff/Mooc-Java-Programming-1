
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userAge;
        int adulthood = 18;
        // Write your program here
        System.out.println("How old are you?");
        userAge = Integer.valueOf(scan.nextLine());
        scan.close();
        if(userAge >= adulthood){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are not an adult");
        }
    }
}
