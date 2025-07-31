package stringcalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {

    StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void isEmpty() {
        int sum = stringCalculator.addNumbers("");
        assertEquals(0, sum);
    }

    @Test
    void testSingleDigit() {
        int sum = stringCalculator.addNumbers("5");
        assertEquals(5, sum);
    }

    @ParameterizedTest
    @CsvSource({
            "'1,2', 3",
            "'4,5', 9",
            "'5,6', 11"
    })
    void parameterisedTest(String numbers, int expectedSum) {
        int sum = stringCalculator.addNumbers(numbers);
        assertEquals(expectedSum, StringCalculator.add(numbers));
    }
}
