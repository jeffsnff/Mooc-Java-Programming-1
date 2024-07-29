
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics statistics = new Statistics();
        EvenSum evenSum = new EvenSum();
        OddSum oddSum = new OddSum();

        System.out.println("Enter numbers:");
        while(true){
            int number = Integer.valueOf(scanner.nextLine());

            if(number == -1){
                break;
            }
            if(number%2==0){
                evenSum.sum(number);
            }
            if(number%2 != 0){
                oddSum.sum(number);
            }
            statistics.addNumber(number);
        }
        scanner.close();
       
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum of even numbers: "+ evenSum.getEvenSum());
        System.out.println("Sum of odd numbers: "+ oddSum.getOddSum());
    }
}
