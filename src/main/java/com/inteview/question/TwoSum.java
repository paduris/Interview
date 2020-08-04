package com.inteview.question;


import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 */
public class TwoSum {



    public static void main (String []a)  throws  Exception
    {
        int[] numbers = {2,7,11,15};
        int target = 17;

        TwoSum twosum = new TwoSum();
        int[] indices = twosum.twoSumHashMap(numbers, target);

        System.out.println("Indices :: " + indices[0] + " " + indices[1]);

    }


    /**
     * brute force solution algorithm
     *
     * @param nums
     * @param target
     * @return
     * @throws Exception
     */
    public int[] twoSum( int[] nums, int target) throws Exception {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0 ; i<nums.length ; i++)
        {
            for (int j = i+1; j <nums.length ; j++ ) {

                if (nums[j] == target - nums[i])
                {
                    return new int[] {i,j};
                }
            }
        }
        throw new Exception("No tow sum found");

    }



    public int[] twoNumberSum(int a[],int target)
    {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            int v = target - a[i];

            if(map.containsKey(v))
            {
                return new int[] {
                        map.get(v),i
                };
            }
            map.put(a[i],i);
        }
        return null;
    }

    /**
     * Smart Solution
     *
     * @param nums
     * @param target
     * @return
     */

    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }




}
