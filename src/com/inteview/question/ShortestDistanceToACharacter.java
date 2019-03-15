package com.inteview.question;

public class ShortestDistanceToACharacter {

    public static void main(String[] a) {
        int[] r = shortestToChar("loveleetcode", "e");

        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }
    }


    private static int[] shortestToChar(String S, String C) {

        char c = C.toCharArray()[0];

        int first = S.indexOf(c);
        int last = S.lastIndexOf(c);
        int fdistance = 0;
        int bdistance = 0;


        char[] values = S.toCharArray();

        int[] result = new int[values.length];

        for (int i = 0; i < values.length; i++) {

            int res = 0;
            if (values[i] == c) {
                res = 0;
            } else if (i < first) {
                res = first - i;
            } else if (last < i) {
                res = i - last;
            } else if (i > first) {
                for (int j = i; j < values.length; j--) {
                    if (values[j] == c) {
                        bdistance = i - j;
                        break;
                    }
                }
                for (int k = i; k < values.length; k++) {
                    if (values[k] == c) {
                        fdistance = k - i;
                        break;
                    }
                }

                if (bdistance < fdistance) {
                    res = bdistance;
                } else {
                    res = fdistance;
                }
            }
            result[i] = res;

        }


        return result;
    }

}
