
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        if(list.size()>2){
            int lastIndex = list.size()-1;
            System.out.println(list.get(0));
            System.out.println(list.get(lastIndex));
        }else if(list.size() ==1){
            System.out.println(list.get(0));
        }else{
            System.out.println("Nothing in List");
        }

    }
}
