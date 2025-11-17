package bankaccount;

public class Account {
    private int balance;

    public void deposit(int amountToDeposit) {
        this.balance += amountToDeposit;


    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int ammountToWithdraw) {

    }
}
