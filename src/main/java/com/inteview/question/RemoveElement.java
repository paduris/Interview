package com.inteview.question;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int idx = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[idx++] = nums[i];
            }
        }
        System.out.println(idx);
    }
}
