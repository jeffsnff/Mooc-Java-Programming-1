
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        // System.out.print("File? ");
        String file = scanner.nextLine();
        // System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        // System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                int numCompare = Integer.valueOf(fileScanner.nextLine());
                if(numCompare >= lowerBound && numCompare <= upperBound){
                    count++;
                }
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Numbers: "+count);
    }

}
