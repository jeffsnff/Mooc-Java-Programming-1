
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        if(array.length == 0){
            System.out.println("Array is empty");
            return;
        }

        for(int index = 0; index<array.length; index++){
            if(index != array.length-1){
                System.out.print(array[index]+", ");
            }else{
                System.out.print(array[index]);
            }
        }
    }
}
