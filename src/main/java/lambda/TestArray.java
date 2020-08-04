package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestArray {
    public String divisibleByNumber(int i) {





        if (i % 3 == 0 && i % 5 == 0) {
            return "How are you?";
        } else if (i % 3 == 0) {
            return "Hi";
        } else if (i % 5 == 0) {
            return "Hello";
        }

        return null;
    }
}
