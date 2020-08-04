package topics.arrays;// Class name must be "Main"
// Libraries included:
// json simple, guava, apache commons lang3, junit, jmock
/**
 * Definition:
 * <p>
 * Two lists are permutations of each other if the first list contains
 * all elements in the second list, and the second list contains
 * all elements in the first list.
 * <p>
 * Examples:
 * <p>
 * {3,1,3} is permutation of {1,3,3}
 * {1,1,3} is not a permutation of {1,3,3}
 * <p>
 * Problem:
 * <p>
 * Given two lists, write an efficient method called isPermutation(...)
 * which returns true if the lists are permutations of each other and false otherwise.
 * Note that each list may contain millions of objects.
 * Best solutions would be written using functional programming and Generics.
 **/

import java.util.HashMap;
import java.util.Map;

class Example {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

//        String[] a = {"3", "1", "3"};
//
//        String[] b = {"3", "1", "3"};

        String a[] = {"2", "1", "3", "5", "4", "3", "2"};
        String b[] = {"3", "2", "8", "4", "5", "3", "1"};

        System.out.println(isPermutation(a, b));
    }


    private static boolean isPermutation(String[] val, String[] val2) {
        boolean returnVal = false;

        if (val.length != val2.length) {
            returnVal = false;
        } else {

         Map<String, Integer> map = new HashMap<String, Integer>();

            for (int i = 0; i < val.length; i++) {
                if (!map.containsKey(val[i])) {
                    map.put(val[i], 1);
                } else {
                    int count = map.get(val[i]);
                    map.put(val[i], ++count);
                    System.out.println("Value ::" + map.get(val[i]));
                }
            }


            for (int j = 0; j < val2.length; j++) {

                if (map.containsKey(val2[j])) {
                    int count = map.get(val2[j]);
                    if (count == 1) {
                        map.remove(val2[j]);
                    } else {
                        map.put(val2[j], --count);
                    }
                }
            }

            if (map.size() > 0) {
                returnVal = false;
            } else {
                returnVal = true;
            }
        }
        return returnVal;
    }

}
