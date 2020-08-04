package com.inteview.question;

public class ReverseInteger {

    public static void main (String []a)
    {

        System.out.println(reverseInteger(345));

    }

    private static int reverseInteger(int val) {

        int rev =0;
        while(val != 0)
        {
            int p = val%10;
            val = val/10;
            rev = rev *10 + p;
        }
          return rev;
    }
}
