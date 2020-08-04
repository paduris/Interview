package com.inteview.question;

public class FinallyBlock {

    public static void main(String[] a) {

        System.out.println(subMethod());
    }
    private static String subMethod() {
        try {
            int k = 20 / 0;
            return "step 1";
        } finally {
            return "Step 2";
        }
    }
}
