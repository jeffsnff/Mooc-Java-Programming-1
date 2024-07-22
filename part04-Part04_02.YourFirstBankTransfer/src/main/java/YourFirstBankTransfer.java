
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here

        Account matthewAccount = new Account("Matthews account", 1000);
        Account jeffAccount = new Account("My account", 0);
        double withdrawAmount = 100.00;
        matthewAccount.withdrawal(withdrawAmount);
        jeffAccount.deposit(withdrawAmount);

        System.out.println(matthewAccount);
        System.out.println(jeffAccount);
    }
}
