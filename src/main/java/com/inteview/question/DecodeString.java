package com.inteview.question;

import java.util.Stack;

/**
 * Given an encoded string, return its decoded string.
 *
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 *
 * You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
 *
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 *
 *
 *
 * Example 1:
 *
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 * Example 2:
 *
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 * Example 3:
 *
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 * Example 4:
 *
 * Input: s = "abc3[cd]xyz"
 * Output: "abccdcdcdxyz"
 *
 */
public class DecodeString {
    public static void main(String[] args) {

        DecodeString decodeString = new DecodeString();
        System.out.println(decodeString.decodeString("3[a2[c]]"));
        //System.out.println();
    }

    public String decodeString(String s) {

        Stack<StringBuilder> builderStack = new Stack<>();
        Stack<Integer> timesStack = new Stack<>();
        builderStack.push(new StringBuilder());
        int times=0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current=='['){
                timesStack.push(times);
                builderStack.add(new StringBuilder());
                times =0;
            }
            else if(current==']'){
                int n = timesStack.pop();
                String curStr = builderStack.pop().toString();
                StringBuilder builder = builderStack.peek();
                for (int j = 0; j <n ; j++) {
                    builder.append(curStr);
                }
            }
            else if(Character.isDigit(current)){
                times = times * 10+ (current-'0');
            }
            else{
                builderStack.peek().append(current);
            }

        }



        return builderStack.peek().toString();


    }


}
