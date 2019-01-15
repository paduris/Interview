package com.inteview.question;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * <p>
 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class JewelsAndStones {

    public static void main(String[] a) {
        JewelsAndStones j = new JewelsAndStones();
        System.out.println(j.numJewelsInStones("aAc", "aAAbbbb"));
    }

    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {

            if (J.indexOf(S.charAt(i)) > -1) {
                count++;
            }
        }
        return count;
    }

}
