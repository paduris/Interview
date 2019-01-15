package com.inteview.question;

import java.util.Arrays;

public class ArrayPartition {
    public static void main (String []a)
    {

        int k[] = {1,4,3,2};
        System.out.println(arrayPairSum(k));
    }

    public static int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int total = 0;

        for (int i = 0; i < nums.length; i=i+2) {
            total = total + nums[i];
        }
        return total;

    }
}
