package com.inteview.question;

public class ToLowerCase {
    public static void main (String []a)
    {
        String val = "Hello";
        char[] l = val.toCharArray();
        for (int i=0; i<l.length;i++) {
            char c = l[i];
            int n=(int)c;
            if(n <91 && n > 65){
                n = n+32;
            }
            char v = (char)n;
            System.out.println(v);
        }
    }
}
