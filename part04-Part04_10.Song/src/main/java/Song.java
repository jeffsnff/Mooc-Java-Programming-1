public class Song {
    private String name = "";
    private int lengthSeconds = 0;

    // Creates song object
    public Song(String name, int length){
        this.name = name;
        this.lengthSeconds = length;
    }

    // Returns the song name
    public String name(){
        return this.name;
    }

    // Returns the song length
    public int length(){
        return this.lengthSeconds;
    }
    
}
