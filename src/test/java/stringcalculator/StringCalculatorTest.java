package stringcalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static stringcalculator.StringCalculator.add;

class StringCalculatorTest {

    @Test
    void isEmpty() {
        assertEquals(0, add(""));
    }

    @Test
    void testSingleDigit() {
        assertEquals(5, add("5"));
    }

    @ParameterizedTest
    @CsvSource({
            "'1,2', 3",
            "'4,5', 9",
            "'5,6', 11"
    })
    void parameterisedTest(String numbers, int expectedSum) {
        assertEquals(expectedSum, add(numbers));
    }
}
