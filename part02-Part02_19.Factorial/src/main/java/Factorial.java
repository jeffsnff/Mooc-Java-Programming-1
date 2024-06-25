
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int factNum = Integer.valueOf(scanner.nextLine());
        int total = 1;

        if(factNum == 0){
            System.out.println("Factorial: "+total);
        }else{
            for(int i=1;i<=factNum; i++){
                total = total * i;
            }
            System.out.println("Factorial: "+total);
        }

    }
}
