package bankaccount;

import net.gamrath.junitpredict.Predict;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(Predict.class)
class AccountTest {

    @Test
    void withdraw100() {
        Account account;
        account.withdraw(100);
        assertEquals(50,account.balance());
    }
}
