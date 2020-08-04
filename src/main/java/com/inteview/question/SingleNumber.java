package com.inteview.question;

import java.util.HashSet;

public class SingleNumber {

    public static void main (String []a)
    {
            //Input: [4,1,2,1,2]

        int[] elements = {2,2,3,2};

        SingleNumber number  = new SingleNumber();
        System.out.println(number.singleNumber(elements));




    }

    public int singleNumber(int[] nums) {

        HashSet<Integer> uniqueElements = new HashSet<>();

        for (int i = 0; i < nums.length ; i++) {

            if(uniqueElements.contains(nums[i]))
            {
                uniqueElements.remove(nums[i]);

            }else {

                uniqueElements.add(nums[i]);
            }
        }
    return uniqueElements.stream().findFirst().get();
    }

    public int singleNumberXOR(int[] nums) {
        int ret = 0;
        for(int num: nums) {
            ret ^= num;
        }
        return ret;
    }

}
