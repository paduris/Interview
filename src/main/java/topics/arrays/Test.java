package topics.arrays;

import javax.sound.midi.Sequence;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Test {


    private final int[] values;

    public Test(int size) {
        values = new int[size];
    }

    public void set(int i, int n) {
        values[i] = n;
    }

    public static final BiPredicate<Test, Test> EQUALS = (seq1, seq2) -> Arrays.equals(seq1.values, seq2.values);

    public static final BiPredicate<Test, Test> EQUALS_IGNORE_ORDER_AND_DUPLICATES = (seq1, seq2) -> {
        Set<Integer> set1 = seq1 != null ? Arrays.stream(seq1.values).boxed().collect(Collectors.toSet()) : Collections.emptySet();
        Set<Integer> set2 = seq2 != null ? Arrays.stream(seq2.values).boxed().collect(Collectors.toSet()) : Collections.emptySet();
        return set1.equals(set2);
    };


    public static void main(String[] args) {
        System.out.println();


        int[] val1 = { 1, 1, 4, 9, 16, 9, 7, 4, 9, 11 };
        int[] val2 = { 11, 7, 9, 16, 7, 4, 1 };

        Test seq1 = new Test(val1.length);
        Test seq2 = new Test(val2.length);

        for (int i = 0; i < val1.length; i++)
            seq1.set(i, val1[i]);

        for (int i = 0; i < val2.length; i++)
            seq2.set(i, val2[i]);

        boolean res1 = Test.EQUALS.test(seq1, seq2);    // false
        boolean res2 = Test.EQUALS_IGNORE_ORDER_AND_DUPLICATES.test(seq1, seq2);   // true

        System.out.println(res1 + "  "+ res2);

    }




}
