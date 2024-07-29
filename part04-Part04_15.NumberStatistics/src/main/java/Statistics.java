
public class Statistics {
    private int count = 0;
    private int sumNums = 0;
    
    public Statistics(){
    }

    // add a value to count
    public void addNumber(int number){
        this.sumNums = this.sumNums + number;
        this.count++;
    }

    // return value of count
    public int getCount(){
        return this.count;
    }

    // sum all the numbers added
    public int sum(){
        return sumNums;
    }

    // average of the numbers
    public double average(){
        if(count == 0){
            return 0.0;
        }
        return (double) sumNums / count;
    }
}
