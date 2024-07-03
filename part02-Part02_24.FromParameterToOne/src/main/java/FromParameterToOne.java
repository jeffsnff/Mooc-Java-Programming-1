

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(4);

    }

    public static void printFromNumberToOne(int countDown){

        for(int count = countDown; count >= 1; count--){
            System.out.println(count);
        }
    }

}
