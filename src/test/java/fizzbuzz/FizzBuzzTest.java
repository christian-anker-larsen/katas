package fizzbuzz;

import net.gamrath.junitpredict.Predict;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(Predict.class)
public class FizzBuzzTest {
    @Test
    @DisplayName("shouldReturn1When1IsGiven")
    void shouldReturn1When1IsGiven() {
        assertEquals("1",fizzBuzz(1));
    }

    private String fizzBuzz(int i) {
        return "1";
    }
}
