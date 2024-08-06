public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamScore;
    private int visitingTeamScore;

    public Game(String homeTeam, String visitingTeam, int homeTeamScore, int visitingTeamScore){
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamScore = homeTeamScore;
        this.visitingTeamScore = visitingTeamScore;
    }

    public String toString(){
        return "Home Team: "+this.homeTeam+" Visitng Team: "+this.visitingTeam;
    }

    public boolean gameWon(String teamSearch){
        if(this.homeTeam.equals(teamSearch)){
            return homeTeamScore > visitingTeamScore;
        }else if(this.visitingTeam.equals(teamSearch)){
            return visitingTeamScore > homeTeamScore;
        }else{
            return false;
        }
    }

    public boolean gameLost(String teamSearch){
        if(this.homeTeam.equals(teamSearch)){
            return homeTeamScore < visitingTeamScore;
        }else if(this.visitingTeam.equals(teamSearch)){
            return visitingTeamScore < homeTeamScore;
        }else{
            return false;
        }
    }

    public boolean homeTeam(String teamSearch){
        if(this.homeTeam.equals(teamSearch)){
            return true;
        }else{
            return false;
        }
    }

    public boolean awayTeam(String teamSearch){
        if(this.visitingTeam.equals(teamSearch)){
            return true;
        }else{
            return false;
        }
    }
}
