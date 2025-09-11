package bankaccount;

import net.gamrath.junitpredict.Predict;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(Predict.class)
class AccountTest {

    @Test
    void withdraw100() {
        Account account = new Account();
        account.setBalance(100);
        account.withdraw(50);
        assertEquals(50,account.balance);
    }

    @Test
    void deposit100() {
        Account account = new Account();
        account.setBalance(100);
        account.deposit(100);
        assertEquals(200,account.getBalance());
    }

    @Test
    void deposit200() {
        Account account = new Account();
        account.setBalance(100);
        account.deposit(200);
        assertEquals(300,account.getBalance());
    }
}
