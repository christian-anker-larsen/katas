package bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    void testDeposits() {
        // Test code for deposits
        Account account = new Account();
        account.deposit(100);

        assertEquals(100, account.getBalance());

        account.deposit(200);
        assertEquals(300, account.getBalance());

    }


}
