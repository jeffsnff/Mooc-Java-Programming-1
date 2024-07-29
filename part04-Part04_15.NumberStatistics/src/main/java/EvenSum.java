public class EvenSum {
    private int evenSum;

    public EvenSum(){
    }

    public void sum(int number){
        this.evenSum = this.evenSum + number;
    }

    public int getEvenSum(){
        return this.evenSum;
    }
}
