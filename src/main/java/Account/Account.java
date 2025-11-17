package Account;

public class Account {
    private int balance;

    public void deposit(int amountToDeposit) {
        this.balance += amountToDeposit;


    }

    public int getBalance() {
        return balance;
    }

}
