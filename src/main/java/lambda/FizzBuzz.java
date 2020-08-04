package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;


    private static String[] generate() {
        List<String> items = new ArrayList<String>();

        for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {

            boolean multipleOfThree = ((i % 3) == 0);
            boolean multipleOfFive = ((i % 5) == 0);

            if (multipleOfThree && multipleOfFive) {
                items.add("FizzBuzz");
            }
            else if (multipleOfThree) {
                items.add("Fizz");
            }
            else if (multipleOfFive) {
                items.add("Buzz");
            }
            else {
                items.add(String.valueOf(i));
            }
        }

        return items.toArray(new String[0]);
    }

    public static String[] getResultAsArray() {
        return generate();
    }

    public static String getResultAsString() {
        String[] result = generate();
        String output = "";
        if (result.length > 0) {
            output = Arrays.toString(result);
            // Strip out the brackets from the result
            output = output.substring(1, output.length() - 1);
        }
        return output;
    }

    public static final void main(String[] args) {
        System.out.println(getResultAsString());
    }
}
