package com.inteview.question;

public class FibonacciRecurssion {

    public static void main(String[] a) {
        fibo(10);
        System.out.println(fibo(29));
    }
    //1,2,3,5,8
    private static int fibo(int n) {
        if (n <= 1) {
            return 1;
        } else if (n <= 0) {
            return 0;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
