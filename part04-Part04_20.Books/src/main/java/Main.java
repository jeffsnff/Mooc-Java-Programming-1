import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        String title = "";
        String publicationYear = "";
        String pageCount = "";

        while(true){
            System.out.print("Title: ");
            title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            pageCount = scanner.nextLine();
            System.out.print("Publication year: ");
            publicationYear = scanner.nextLine();

            books.add(new Book(title, publicationYear, pageCount));
        }

        System.out.println("What information will be printed?");
        String whatToPrint = scanner.nextLine();

        if(whatToPrint.equals("everything")){
            for(Book book : books){
                System.out.println(book);
            }
        }else if(whatToPrint.equals("name")){
            for(Book book : books){
                System.out.println(book.bookTitle());
            }
        }

        scanner.close();
    }
}
