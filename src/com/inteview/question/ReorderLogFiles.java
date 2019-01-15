package com.inteview.question;

import java.util.*;

/**
 * You have an array of logs.  Each log is a space delimited string of words.
 *
 * For each log, the first word in each log is an alphanumeric identifier.  Then, either:
 *
 * Each word after the identifier will consist only of lowercase letters, or;
 * Each word after the identifier will consist only of digits.
 * We will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that each log has at least one word after its identifier.
 *
 * Reorder the logs so that all of the letter-logs come before any digit-log.  The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.
 * The digit-logs should be put in their original order.
 *
 * Return the final order of the logs.
 *
 *
 * Example 1:
 *
 * Input: ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
 * Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 *
 * Note:
 *
 * 0 <= logs.length <= 100
 * 3 <= logs[i].length <= 100
 * logs[i] is guaranteed to have an identifier, and a word after the identifier.
 *
 */
public class ReorderLogFiles {



    public static void main (String []a)
    {
        ReorderLogFiles obj = new ReorderLogFiles();

        String [] log = new String[] {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};

        obj.reorderLogFiles(log);
    }








    public String[] reorderLogFiles(String[] logs) {


        List<String> alphabets = new ArrayList<>();
        List<String> numbers = new ArrayList<>();


        for (int i = 0; i < logs.length; i++) {

            String str = logs[i];

            if(Character.isAlphabetic(str.charAt(str.length()-1)))
            {
                alphabets.add(str);
            }else{
                numbers.add(str);
            }
        }

        Collections.sort(alphabets, (a, b) -> {
            String id1 = a.substring(0, a.indexOf(" "));
            String content1 = a.substring(a.indexOf(" ") + 1);
            String id2 = b.substring(0, b.indexOf(" "));
            String content2 = b.substring(b.indexOf(" ") + 1);
            int compare = content1.compareTo(content2);
            if (compare != 0) return compare;
            return id1.compareTo(id2);
        });





        alphabets.addAll(numbers);

        String[] strings = alphabets.toArray(new String[0]);


        return strings;



    }

}
