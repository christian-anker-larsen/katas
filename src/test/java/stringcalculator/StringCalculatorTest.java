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
        int sum = stringCalculator.addNumbers("1,2");
        assertEquals(3, sum);
    }

    @Test
    void isEmpty(){
        stringCalculator = new StringCalculator();
        int sum = stringCalculator.addNumbers("");
        assertEquals(0,sum);
    }

    @Test
    void testAdd2Numbers2() {
        stringCalculator = new StringCalculator();
        int sum = stringCalculator.addNumbers("4,5");
        assertEquals(9, sum);
    }

    @Test
    void testAdd2Numbers3() {
        stringCalculator = new StringCalculator();
        int sum = stringCalculator.addNumbers("5,6");
        assertEquals(11, sum);
    }

    @Test
    void testSingleDigit(){
        stringCalculator = new StringCalculator();
        int sum = stringCalculator.addNumbers("5");
        assertEquals(5, sum);
    }

}
