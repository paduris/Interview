package com.inteview.question;

public class IsNumberPrime {


    public static void main(String a[]) {
        boolean isPrime = isPrimeNumber(347);
        System.out.println(" Is PrimeNumber :: " + isPrime);
    }

    private static boolean isPrimeNumber(int n) {
        // is divided by itself and one
        for (int i = 2; i < Math.sqrt(n); i++) {
            System.out.println(Math.sqrt(n));
            //System.out.println(n % i);
            if (n % i == 0) {

                return false;
            }
        }
        return true;
    }
}
