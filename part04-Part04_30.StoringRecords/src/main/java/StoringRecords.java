
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        
        // Reads name in user provided file and splits name and age by "," then adds them to person List using the Person Class.
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                String[] personArray = fileScanner.nextLine().split(",");
                String personName = personArray[0];
                int personAge = Integer.valueOf(personArray[1]);
                persons.add(new Person(personName, personAge));
            }
        }catch(Exception e){
            System.out.print("Error: "+e.getMessage());
        }

        // Write here the code for reading from file
        // and printing the read records
        return persons;

    }
}
