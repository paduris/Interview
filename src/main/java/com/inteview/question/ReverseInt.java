package com.inteview.question;

public class ReverseInt {

    public static void main(String[] args) {

        int a = 657;
        int rev = 0;

        while (a != 0) {
            int r = a % 10;
            a = a / 10;
            rev = rev * 10 + r;
        }
        System.out.println(rev);
    }
}
