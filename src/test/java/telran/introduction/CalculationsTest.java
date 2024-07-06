package telran.introduction;

/* import static org.junit.jupiter.api.Assertions.assertEquals; THIS WAY YOU HAVE TO HAND PICK ALL THE METHODS, WHIT ASTERISCO YOU SELECT ALL*/
import static org.junit.jupiter.api.Assertions.*;
import static telran.introduction.Calculations.*;

import org.junit.jupiter.api.Test;

public class CalculationsTest {
    @Test
    void sumTest() {
        // assertEquals : the first parameter is the result that is expected in the
        // test, the second parameter is the action of the method tested.
        assertEquals(4, sum(2, 2));
    }
    @Test
    void multTest(){
        assertEquals(0, multiply(2, 0));
        assertEquals(6, multiply(3, 2));
    }
    @Test
    void divTest(){
        assertEquals(0, divide(0, 4));
        assertEquals(2, divide(6, 3));
        try {
            divide(10, 0); // should throw an exception
            fail("expected throw exception");
        } catch (IllegalArgumentException e) {
            // its expected that gets here when the exception is throw
            assertEquals("the denominator cant be 0", e.getMessage());
        }
    }
    @Test
    void subsTest(){
        assertEquals(-3, substract(2, 5));
        assertEquals(5, substract(10, 5));
    }
    @Test
    void sumDigitsTest(){
        assertEquals(1 ,sumOfDigits(1));
        assertEquals(2 ,sumOfDigits(12));
        assertEquals(3 ,sumOfDigits(123));
        assertEquals(4 ,sumOfDigits(5436));
    }
    @Test
    void maxDigTest(){
        assertEquals(5, maxDigit(3425));
        assertEquals(6, maxDigit(34162));
    }
    @Test
    void isDivTestTrue(){
       assertTrue(isDividedOn(6, 3)); 
       assertTrue(isDividedOn(6, 2)); 
    }
    @Test
    void isDivTestFalse(){
        assertFalse(isDividedOn(6, 5));
        assertFalse(isDividedOn(6, 4));
    }
}
