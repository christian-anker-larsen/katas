package bankaccount;

import Account.Account;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void testDeposits() {
        // Test code for deposits
        Account account = new Account();
        account.deposit(100);

//        int balance = account.getBalance();
    }
}
