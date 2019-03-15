package com.inteview.question;

public class ReverseString {
    public static void main (String []a)
    {
        String s ="hello";

        char c [] = s.toCharArray();
        int start =0;
        int end=c.length-1;
        while(start < end)
        {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;

            start++;
            end--;
        }

        String.valueOf(c);
        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]);
        }
    }
}
