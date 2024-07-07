
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a list and store user inputted numbers
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 9999){
                break;
            }

            list.add(input);
        }
        // Loop over the list and store smallest number
        int index = 0;
        int smallest = list.get(index);
        for(index = 0; index<list.size(); index++){
            if(list.get(index) < smallest){
                smallest = list.get(index);
            }
        }
        System.out.println("Smallest number: "+smallest);

        // find and print index
        for(index = 0; index<list.size(); index++){
            if(list.get(index) == smallest){
                System.out.println("Found at index: "+index);
            }
        }
    }
}
