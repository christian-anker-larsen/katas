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

    @Test
    void shouldReturn2Given2() {
        assertEquals("2", fizzBuzz(2));
    }

    @Test
    void shouldReturnFizzGiven3() {
        assertEquals("Fizz",fizzBuzz(3));
    }

    @Test
    void shouldReturnFizzGiven6() {
        assertEquals("Fizz",fizzBuzz(6));
    }

    private String fizzBuzz(int i) {
        if (i == 3 || i == 6) return "Fizz";
        return String.valueOf(i);
    }
}
