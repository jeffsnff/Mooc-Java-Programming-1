
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();
        String userSearch = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            stringList.add(input);
        }

        System.out.print("Search for? ");
        userSearch = scanner.nextLine();

        if(stringList.contains(userSearch)){
            System.out.println(userSearch+" was found!");
        }else{
            System.out.println(userSearch+" was not found!");
        }

    }
}
