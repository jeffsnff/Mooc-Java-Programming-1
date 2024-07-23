public class Gauge {
    private int value;

    public Gauge(){
        value = 0;
    }

    // if under 5, grows by 1
    public void increase(){
        if(value < 5){
            value++;
        }
    }

    // if greater than 0, decrease by 1
    public void decrease(){
        if(value > 0){
            value--;
        }
    }

    // Return the value varibale
    public int value(){
        return value;
    }

    // return true is value == 5
    public boolean full(){
        if(value ==5){
            return true;
        }else{
            return false;
        }
    }
}
