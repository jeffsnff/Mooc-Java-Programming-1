
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumYears = 0;
        int count = 0;
        String longestName = "";

        while(true){
            String userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }
            String[] person = userInput.split(",");
            if(person[0].length() > longestName.length()){
                longestName = person[0];
            }
            sumYears = sumYears + Integer.valueOf(person[1]);
            count++;
        }

        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+ ((double)sumYears/count));
    }
}
