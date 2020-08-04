package com.inteview.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {


    public static void main(String[] args) {

        String[] strings = new String[]{"Jon", "Jerry", "George"};

        Set<String> hashSet = new HashSet<String>(Arrays.asList(strings));

        hashSet.stream().forEach(System.out::println);

        ArrayToSet arrayToSet = new ArrayToSet();
        arrayToSet.convertArrayToSet(strings).stream().forEach(System.out::println);
    }

    private <T> Set<T> convertArrayToSet(T[] array) {
        return new HashSet<T>(Arrays.asList(array));
    }
}
