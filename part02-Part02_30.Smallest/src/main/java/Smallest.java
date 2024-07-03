
public class Smallest {
    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }

    public static int smallest(int num1, int num2){
        if(num1 < num2){
            return num1;
        }else if(num1 > num2){
            return num2;
        }else{
            return 0;
        }
    }
}
