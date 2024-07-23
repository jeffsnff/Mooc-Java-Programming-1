public class Film {
    private String name;
    private int ageRating;

    // Create film object
    public Film(String filmName, int filmAgeRating){
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }

    // Return name of film
    public String name(){
        return this.name;
    }

    // Return age rating of film
    public int ageRating(){
        return this.ageRating;
    }
}
