package com.inteview.question;

import java.util.HashMap;

public class IntegerToRoman2 {
    private static int[] bases = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static HashMap<Integer, String> map = new HashMap<Integer, String>();

    private static void setup() {
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
    }

    public static void main(String[] args) {

        convertNumberToRoman(3456);

    }

    private static void convertNumberToRoman(int number) {
        setup();
        StringBuilder builder = new StringBuilder();
        for (int base : bases  ) {
            while(number >= base )
            {
                number = number - base;
                builder.append(map.get(base));
            }
        }
        System.out.println(builder.toString());
    }
}
