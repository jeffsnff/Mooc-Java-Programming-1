public class PaymentCard {
    private double balance = 0.0;
    
    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }

    public String toString(){
        return "The card has a balance of "+balance+" euros";
    }

    // Reduce balance by 2.60 euros
    public void eatAffordably(){
        checkBalance(2.60);
    }

    // Reduce balance by 4.60 euros
    public void eatHeartily(){
        checkBalance(4.60);
    }

    // Checks to see if card will be negative. If so, transaction doesn't go through
    private void checkBalance(double transaction){
        if(this.balance - transaction >= 0){
            this.balance = this.balance - transaction;
        }
    }

    // Increase cards balance by amount provided but not exceed 150
    public void addMoney(double amount){
        if(amount > 0.0){
            if(this.balance + amount > 150){
                this.balance = 150;
            }else{
                this.balance = this.balance + amount;
            }
        }
    }
}

