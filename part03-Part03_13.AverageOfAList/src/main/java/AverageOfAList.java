
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int userInput = 0;
        int sum = 0;

        while(true){
            userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == -1){
                break;
            }
            list.add(userInput);
        }

        for(int number : list){
            sum = sum + number;
        }

        System.out.println((double) sum/list.size());
    }
}
