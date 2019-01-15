package com.inteview.question;

public class IsNumberPalindrome {

    public static void main (String []a)
    {
        isNumberPalindrome(4554);

    }

    private static void isNumberPalindrome(int i) {
        int rev =0;

        while(i > rev)
        {
            int p = i%10;
            i =i/10;
            rev = rev *10 + p ;
        }
        System.out.println(i==rev || i==rev/10);
    }
}
