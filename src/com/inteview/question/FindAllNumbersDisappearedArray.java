package com.inteview.question;

import java.util.*;


/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * <p>
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * <p>
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 * <p>
 * Example:
 * <p>
 * Input:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * Output:
 * [5,6]
 */
public class FindAllNumbersDisappearedArray {

    public static void main(String[] a) {

        int values[] = {4,3,2,7,8,2,3,1};

        FindAllNumbersDisappearedArray obj = new FindAllNumbersDisappearedArray();
        obj.findDisappearedNumbers(values).stream().forEach(v -> System.out.println(v));


    }

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> re = new ArrayList<>();
        int[] missNumbers = new int[nums.length + 1];


        for (int n : nums){
            missNumbers[n]++;}


        for (int i = 1; i <= nums.length; i++)
            if (missNumbers[i] == 0)
                re.add(i);
        return re;


    }
}
