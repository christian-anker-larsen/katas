package bankaccount;

public class Account {
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}
