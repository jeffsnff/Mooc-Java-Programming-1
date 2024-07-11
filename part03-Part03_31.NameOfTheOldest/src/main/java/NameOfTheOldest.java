
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int oldestAge = 0;

        while(true){
            String userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }

            String[] person = userInput.split(",");
            if(Integer.valueOf(person[1])  > oldestAge){
                oldestAge = Integer.valueOf(person[1]);
                oldestName = person[0];
            }
        }
        System.out.println("Name of the oldest: "+oldestName);
    }
}
