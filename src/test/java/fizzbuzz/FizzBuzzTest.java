package fizzbuzz;

import net.gamrath.junitpredict.Predict;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void shouldReturnFizzGivenMultipleOf3(int input) {
        assertEquals("Fizz",fizzBuzz(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10})
    void shouldReturnBuzzGivenMultipleOf5(int input) {
        assertEquals("Buzz", fizzBuzz(input));
    }

    private String fizzBuzz(int i) {
        if (i % 5 == 0) return "Buzz";
        if (i % 3 == 0) return "Fizz";
        return String.valueOf(i);
    }
}
