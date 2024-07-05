
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }

        System.out.println("From where?");
        int firstIndex = Integer.valueOf(scanner.nextLine());

        System.out.println("To where?");
        int lastIndex = Integer.valueOf(scanner.nextLine());

        for( int index = firstIndex; index<numbers.size(); index++){
            if(index > lastIndex){
                break;
            }
            System.out.println(numbers.get(index));
        }
    }
}
