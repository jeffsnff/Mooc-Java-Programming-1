
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileToPrint = scanner.nextLine();
        scanner.close();
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileToPrint))){
            System.out.println("In try");
            while(fileScanner.hasNextLine()){
                System.out.println("In While");
                String fileLine = fileScanner.nextLine();
                System.out.println("After scanner reads file line");
                System.out.println(fileLine);
            }
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
