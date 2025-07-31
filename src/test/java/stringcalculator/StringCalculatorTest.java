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

    @Test
    void isEmpty(){
        stringCalculator = new StringCalculator();
        String inputString2 ="";
        int sum = stringCalculator.addNumbers(inputString2);
        assertEquals(0,sum);
    }

    @Test
    void testAdd2Numbers2() {
        stringCalculator = new StringCalculator();
        String inputString = "4,5";
        int sum = stringCalculator.addNumbers(inputString);
        assertEquals(9, sum);
    }

    @Test
    void testAdd2Numbers3() {
        stringCalculator = new StringCalculator();
        String inputString = "5,6";
        int sum = stringCalculator.addNumbers(inputString);
        assertEquals(11, sum);
    }

}
