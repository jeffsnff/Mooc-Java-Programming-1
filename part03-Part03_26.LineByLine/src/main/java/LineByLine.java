
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String[] inputArray = new String[];
        String userInput = "";
        
        while(true){
            userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }
            String[] inputArray = userInput.split(" ");
            
            for(String a : inputArray){
                System.out.println(a);
            }
        }
    }
}
