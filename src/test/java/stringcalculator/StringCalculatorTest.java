package stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringCalculatorTest {

    StringCalculator stringCalculator;

    @Test
    void isTrue() {
        assertTrue(true);
    }

    @Test
    void testMethod(){
        stringCalculator = new StringCalculator();
        String inputString = "1,2";
        int sum = stringCalculator.addNumbers(inputString);
        assertEquals(3, sum);
    }

}
