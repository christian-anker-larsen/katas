package stringcalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {

    StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void testMethod(){
        int sum = stringCalculator.addNumbers("1,2");
        assertEquals(3, sum);
    }

    @Test
    void isEmpty(){
        int sum = stringCalculator.addNumbers("");
        assertEquals(0,sum);
    }

    @Test
    void testAdd2Numbers2() {
        int sum = stringCalculator.addNumbers("4,5");
        assertEquals(9, sum);
    }

    @Test
    void testAdd2Numbers3() {
        int sum = stringCalculator.addNumbers("5,6");
        assertEquals(11, sum);
    }

    @Test
    void testSingleDigit(){
        int sum = stringCalculator.addNumbers("5");
        assertEquals(5, sum);
    }

}
