package com.inteview.question;

public class FindBiggestNumber {

    public static void main(String[] args) {
        int p[] = {3, 5, 6, 7, 7, 12, 1, 32, 44, 55, 23, 77, 65, 4};
        System.out.println(findBiggestNumber(p));
        System.out.println(findBiggestNumberRecursive(p,p[p.length-1]));
    }

    private static int findBiggestNumber(int[] p) {

        int bigNumber = p[0];

        for (int i = 1; i < p.length - 1; i++) {

            if (bigNumber < p[i]) {
                bigNumber = p[i];
            }
        }
        return bigNumber;
    }


    private static int findBiggestNumberRecursive(int []p , int n) {
        int bigNumber = Integer.MIN_VALUE;

        if (n == -1) {
            return bigNumber;
        } else {

            if (p[n] > bigNumber) {
                bigNumber = p[n];

            }

            return findBiggestNumberRecursive(p, n - 1);
        }
    }





}
