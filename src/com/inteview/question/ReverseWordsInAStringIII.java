package com.inteview.question;

public class ReverseWordsInAStringIII {

    public static void main(String[] a) {
        String rev = "Let's take LeetCode contest";
        ReverseWordsInAStringIII revW = new ReverseWordsInAStringIII();
        System.out.println(revW.reverseWords(rev));
        //revW.reverseWords(rev);
    }






    public String reverseWords(String s) {

        StringBuilder builder = new StringBuilder();
        String[] revWords = s.split(" ");
        for (int k = 0; k < revWords.length; k++) {
            char[] c = revWords[k].toCharArray();
            if(k>0)       builder.append(" ");
            for (int i = c.length - 1; i != -1 && i < c.length; i--) {
                builder.append(c[i]);
            }
        }
        return builder.toString();
    }
}
