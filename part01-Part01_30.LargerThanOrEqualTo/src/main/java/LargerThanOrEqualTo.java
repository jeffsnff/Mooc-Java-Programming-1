
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println("Give the first number:");
        firstNumber = Integer.valueOf(scan.nextLine());
        System.out.println("Gove the second number:");
        secondNumber = Integer.valueOf(scan.nextLine());

        if(firstNumber > secondNumber){
            System.out.println("Greatest number is: "+firstNumber);
        }else if(secondNumber > firstNumber){
            System.out.println("Greatest number is: "+secondNumber);
        }else{
            System.out.println("The numbers are equal!");
        }
    }
}
