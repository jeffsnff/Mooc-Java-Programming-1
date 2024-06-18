
import java.util.Scanner;

public class Ancient {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        // Write your program here
        int userYear;
        int ancientHistory = 2015;
        System.out.println("Give a year:");
        userYear = Integer.valueOf(scan.nextLine());
        if(userYear < ancientHistory){
        	System.out.println("Ancient History!");
        }
    }
}
