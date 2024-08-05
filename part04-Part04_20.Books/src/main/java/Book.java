public class Book {

    private String title;
    private String publicationYear;
    private String pageCount;

    public Book(String title, String publicationYear, String pageCount){
        this.title = title;
        this.publicationYear = publicationYear;
        this.pageCount = pageCount;
    }

    public String toString(){
        return title+", "+pageCount+" pages, "+publicationYear;
    }

    public String bookTitle(){
        return title;
    }
    
}
