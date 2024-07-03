

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(2);
    }

    public static void printUntilNumber(int numRepeat){

        for(int count = 1; count<=numRepeat; count++){
            System.out.println(count);
        }
    }

}
