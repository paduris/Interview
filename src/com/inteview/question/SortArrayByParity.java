package com.inteview.question;

public class SortArrayByParity {
    public static void main(String[] a) {

        int k[] = {1,0,3};

        sortByParity(k);
    }

    private static void sortByParity(int[] a) {

        int start = 0;
        int end = a.length - 1;
        int temp = 0;

        while (start < end) {

            int x = a[start] % 2;
            int y = a[end] % 2;

            if(x != 0 && y != 0)
            {
                end--;
                continue;
            }
            if ((x == 0 && y != 0)) {
                start++;
                end--;
            }
            if ((x == 0 && y == 0)) {
                start++;

            }
            if (x == 0) {
                continue;
            }
            if (x != 0 && y == 0) {
                swap(a, start, end);
                start++;
                end--;
            }
        }
        printArray(a);
    }

    private static void swap(int[] a, int start, int end) {
        int temp;
        temp = a[end];
        a[end] = a[start];
        a[start] = temp;
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
