
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        if(array.length == 0){
            return sum;
        }

        for(int index = 0; index<array.length; index++){
            sum = sum + array[index];
        }
        
        return sum;
    }
}
