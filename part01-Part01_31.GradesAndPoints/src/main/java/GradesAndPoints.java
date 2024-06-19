
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int gradePoint = Integer.valueOf(scan.nextLine());

        if(gradePoint > 100){
            System.out.println("Incredible!");
        }else if(gradePoint >= 90 && gradePoint <= 100) {
            System.out.println("5");
        }else if(gradePoint >= 80 && gradePoint <= 89) {
            System.out.println("4");
        }else if(gradePoint >= 70 && gradePoint <= 79) {
            System.out.println("3");
        }else if(gradePoint >= 60 && gradePoint <= 69) {
            System.out.println("2");
        }else if(gradePoint >= 50 && gradePoint <= 59) {
            System.out.println("1");
        }else if(gradePoint >= 0 && gradePoint <= 49) {
            System.out.println("failed");
        }else if(gradePoint < 0) {
            System.out.println("impossible");
        }
    }
}
