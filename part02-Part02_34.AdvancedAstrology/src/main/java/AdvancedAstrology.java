
public class AdvancedAstrology {

    public static void printStars(int number) {
        String stars= "";
        // part 1 of the exercise
        for(int i=0; i<number; i++){
            stars += "*";
        }
        System.out.println(stars);
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i=1; i<=number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int count = size-1;
        // part 2 of the exercise
        for(int i=1; i<=size; i++){
            printSpaces(count);
            printStars(i);
            count--;
        }
    }

    public static void christmasTree(int height) {
        int count = height -1;
        int width = 1;
        for(int i=0; i<height; i++){
            printSpaces(count);
            printStars(width);
            width = width + 2;
            count--;
        }
        printSpaces((height-2));
        printStars(3);
        printSpaces((height-2));
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(3);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(9);
    }
}
