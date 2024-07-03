
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(2, 10);
    }
    public static void divisibleByThreeInRange(int num1, int num2){
        for(int i = num1; i<=num2; i++){
            if(num1 % 3 == 0){
                System.out.println(num1);
            }
            num1++;
        }
    }
}
