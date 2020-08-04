import lambda.FizzBuzz;
import lambda.TestArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void testReturnsAnArrayOfOneHundred() {
        String[] result = FizzBuzz.getResultAsArray();
        assertEquals(100, result.length);
    }

    @Test
    public void testPrintsAStringRepresentationOfTheArray() {
        String result = FizzBuzz.getResultAsString();
        assertNotNull(result);
        assertNotSame(0, result.length());
        assertEquals("1, 2", result.substring(0, 4));
    }

    @Test
    public void testMultiplesOfThreeAndFivePrintFizzBuzz() {
        String[] result = FizzBuzz.getResultAsArray();

        // Check all instances of "FizzBuzz" in array
        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0 && (i % 5) == 0) {
                assertEquals("FizzBuzz", result[i - 1]);
            }
        }
    }

    @Test
    public void testMultiplesOfThreeOnlyPrintFizz() {
        String[] result = FizzBuzz.getResultAsArray();

        // Check all instances of "Fizz" in array
        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0 && !((i % 5) == 0)) {
                assertEquals("Fizz", result[i - 1]);
            }
        }
    }

    @Test
    public void testMultiplesOfFiveOnlyPrintBuzz() {
        String[] result = FizzBuzz.getResultAsArray();

        // Check all instances of "Buzz" in array
        for (int i = 1; i <= 100; i++) {
            if ((i % 5) == 0 && !((i % 3) == 0)) {
                assertEquals("Buzz", result[i - 1]);
            }
        }
    }

}
