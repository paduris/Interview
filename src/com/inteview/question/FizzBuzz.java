package com.inteview.question;


import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 * <p>
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”
 */
public class FizzBuzz {


    public static void main(String[] a) {

        FizzBuzz obj = new FizzBuzz();
        obj.fizzBuzz(15).stream().forEach(l -> System.out.println(l + "\n"));


    }

    public List<String> fizzBuzz(int n) {

        List<String> returnList = new ArrayList<>();


        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                returnList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                returnList.add("Fizz");
            } else if (i % 5 == 0) {
                returnList.add("Buzz");
            } else {
                returnList.add(String.valueOf(i));
            }

        }


        return returnList;

    }
}
