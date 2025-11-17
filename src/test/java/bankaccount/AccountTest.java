package bankaccount;

import Account.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    void testDeposits() {
        // Test code for deposits
        Account account = new Account();
        account.deposit(100);

        int balance = account.getBalance();

        assertEquals(100, balance);

        account.deposit(200);
        assertEquals(300, account.getBalance());

    }
}
