package bankaccount;


public class Account {

    public int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(int i) {
        this.balance = balance - i;
    }

    public void deposit(int i) {
        this.balance = 200;
    }
}
