
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum = Integer.valueOf(scanner.nextLine());
        int numAbsolute;
        if(userNum < 0){
            numAbsolute = userNum * -1;
        }else{
            numAbsolute = userNum;
        }

        System.out.println(numAbsolute);
    }
}
