
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Game> teams = new ArrayList<>();

        // System.out.print("File: ");
        // String fileName = scan.nextLine();
        String fileName = "data.csv";

        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while(fileScanner.hasNextLine()){
                String[] team = fileScanner.nextLine().split(",");
                String homeTeam = team[0];
                String visitingTeam = team[1];
                int homeTeamScore = Integer.valueOf(team[2]);
                int visitingTeamScore = Integer.valueOf(team[3]);

                

            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }





    }
}
