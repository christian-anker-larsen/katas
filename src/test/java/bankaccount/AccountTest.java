package bankaccount;

import net.gamrath.junitpredict.Predict;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(Predict.class)
class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
        account.setBalance(100);
    }

    @Test
    void withdraw100() {
        account.withdraw(50);
        assertEquals(50,account.balance);
    }

    @Test
    void deposit100() {
        account.deposit(100);
        assertEquals(200,account.getBalance());
    }

    @Test
    void deposit200() {
        account.deposit(200);
        assertEquals(300, account.getBalance());
    }
}
