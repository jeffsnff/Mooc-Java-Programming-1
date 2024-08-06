
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Game> teams = new ArrayList<>();
        int numGames = 0;
        int numWins = 0;
        int numLosses = 0;

        System.out.print("File: ");
        String fileName = scan.nextLine();

        // Adds teams from csv to TeamList using Game Class
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while(fileScanner.hasNextLine()){
                String[] team = fileScanner.nextLine().split(",");
                String homeTeam = team[0].toLowerCase();
                String visitingTeam = team[1].toLowerCase();
                int homeTeamScore = Integer.valueOf(team[2]);
                int visitingTeamScore = Integer.valueOf(team[3]);

                teams.add(new Game(homeTeam, visitingTeam, homeTeamScore, visitingTeamScore));
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        // Number of games team played
        System.out.print("Team: ");
        String userSearchTeam = scan.nextLine();

        for(Game team : teams){
            // Increments number of games played
            if(team.homeTeam(userSearchTeam) || team.awayTeam(userSearchTeam)){
                numGames++;
            }
            // Increments number of games won
            if(team.gameWon(userSearchTeam)){
                numWins++;
            }
            // Increments number of games lost
            if(team.gameLost(userSearchTeam)){
                numLosses++;
            }
        }


        System.out.println("Games: "+numGames);
        System.out.println("Wins: "+numWins);
        System.out.println("Losses: "+numLosses);
    }
}
