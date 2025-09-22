package bankaccount;


public class Account {

    private int balance;

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
        this.balance += i;
    }

    public String printStatement() {
        return "Account Balance: " + this.balance;
    }
}
