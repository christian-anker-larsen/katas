package fizzbuzz;

import net.gamrath.junitpredict.Predict;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(Predict.class)
class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({
        "1, 1",
        "2, 2",
    })
    @DisplayName("shouldReturn1When1IsGiven")
    void shouldReturn1When1IsGiven(int input, String expected) {
        assertEquals(expected,fizzBuzz(input));
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

    @ParameterizedTest
    @ValueSource(ints = {15, 30})
    void shouldReturnFizzBuzzGivenMultipleOfBothThreeAndFive(int input) {
        assertEquals("FizzBuzz", fizzBuzz(input));
    }

    private String fizzBuzz(int number) {
        String result = "";
        if (isMultipleOfThree(number)) result += "Fizz";
        if (isMultipleOfFive(number)) result += "Buzz";
        return result.isEmpty() ? String.valueOf(number) : result;
    }

    private boolean isMultipleOfFive(int i) {
        return i % 5 == 0;
    }

    private boolean isMultipleOfThree(int i) {
        return i % 3 == 0;
    }
}
