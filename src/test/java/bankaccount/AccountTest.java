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
    }

    @Test
    void withdraw100() {
        account.setBalance(100);
        account.withdraw(50);
        assertEquals(50,account.balance);
    }

    @Test
    void deposit100() {
        account.setBalance(100);
        account.deposit(100);
        assertEquals(200,account.getBalance());
        account.deposit(200);
        assertEquals(400, account.getBalance());
    }
}
