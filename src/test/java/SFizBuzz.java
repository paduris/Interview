
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SFizBuzz {

    public static void main(String[] a) {

        Integer[] values = {3, 4, 5, 6, 67, 7, 8, 9, 15};

        System.out.println(mapGivenStrings(values));


    }


    public static String mapGivenStrings(Integer[] values) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < values.length; i++) {

            builder.append(getResult(values[i]));
            if (i < values.length - 1) {
                builder.append(",");
            }

        }

        return builder.toString();
    }

    private static String getResult(int i) {
        boolean isDivisibleBy3 = i % 3 == 0;
        boolean isDivisibleBy5 = i % 5 == 0;

        if (isDivisibleBy3 && isDivisibleBy5) {
            return "How are you";
        } else if (isDivisibleBy5) {
            return "Hello";
        } else if (isDivisibleBy3) {
            return "Hi";
        } else {
            return String.valueOf(i);
        }
    }


    @Test
    public void testMultiplesOfThreeOnlyPrintFizz() {
        Integer[] values = {3, 4, 5, 6, 67, 7, 8, 9, 15};
        assertEquals("Hi,4,Hello,Hi,67,7,8,Hi,How are you", mapGivenStrings(values));
    }

}
