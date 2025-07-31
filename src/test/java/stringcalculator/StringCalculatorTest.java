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
        assertEquals(0, stringCalculator.addNumbers(""));
    }

    @Test
    void testSingleDigit() {
        assertEquals(5, stringCalculator.addNumbers("5"));
    }

    @ParameterizedTest
    @CsvSource({
            "'1,2', 3",
            "'4,5', 9",
            "'5,6', 11"
    })
    void parameterisedTest(String numbers, int expectedSum) {
        assertEquals(expectedSum, StringCalculator.add(numbers));
    }
}
