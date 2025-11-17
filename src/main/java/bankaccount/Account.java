package bankaccount;

public class Account {
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amountToDeposit) {
        this.balance += amountToDeposit;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amountToWithdraw) {
        balance -= amountToWithdraw;
    }
}
