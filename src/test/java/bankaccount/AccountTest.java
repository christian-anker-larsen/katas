package bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    void testDeposits() {
        // Test code for deposits
        Account account = new Account(0);
        account.deposit(100);

        assertEquals(100, account.getBalance());

        account.deposit(200);
        assertEquals(300, account.getBalance());

    }

    @Test
    void testWithdraws() {
        Account account = new Account(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }
}
