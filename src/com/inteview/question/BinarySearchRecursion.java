package com.inteview.question;

public class BinarySearchRecursion {

    public static void main(String[] args) {

        int p[] = {3, 5, 6, 7, 7, 12, 13, 32, 44, 55, 77};

        System.out.println(binarySearch(p, 0, p.length - 1, 32));
    }

    private static int binarySearch(int sortedArray[], int start, int end, int key) {


        if (start < end) {
            int mid = (end + start) / 2;

            if (sortedArray[mid] == key) {
                return mid;
            } else if (key < sortedArray[mid]) {
                return binarySearch(sortedArray, start, mid, key);
            } else if (key > sortedArray[mid]) {
                return binarySearch(sortedArray, mid + 1, end, key);
            }
        }
        return -1;
    }

}
