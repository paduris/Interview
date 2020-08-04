import lambda.TestArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArrayTest {

    @Test
    void test_divisibleByNumber()
    {
        TestArray testArray = new TestArray();

        Integer []intArray = {2,3,4,5,67,9,15};


        assertEquals("Hi",testArray.divisibleByNumber(3));
        assertEquals("Hello",testArray.divisibleByNumber(5));
        assertEquals("How are you?",testArray.divisibleByNumber(15));
    }


}
