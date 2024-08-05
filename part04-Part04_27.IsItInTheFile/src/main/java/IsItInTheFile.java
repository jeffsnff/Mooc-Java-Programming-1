
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while(fileScanner.hasNextLine()){
                if(fileScanner.nextLine().equals(searchedFor)){
                    System.out.println("Found!");
                    break;
                }

                if(!fileScanner.hasNextLine()){
                    System.out.println("Not found.");
                }
                
            }
            
        }catch(Exception e){
            System.out.println("Reading the file "+e.getMessage()+" failed.");
        }

    }
}
