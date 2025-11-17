package bankaccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account(100);
    }

    @Test
    void testDeposits() {
        // Test code for deposits
        Account account = new Account(100);
        account.deposit(100);

        assertEquals(200, account.getBalance());

        account.deposit(200);
        assertEquals(400, account.getBalance());

    }

    @Test
    void testWithdraws() {
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }
}
