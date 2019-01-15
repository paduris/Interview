package com.inteview.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

    public static void main (String []k)
    {
        List<String> strList  = new ArrayList<>();
        strList.add("a8 ");
        strList.add("g1 ");
        strList.add("ab1 ");
        strList.add("a1 ");


        Collections.sort(strList, (a, b) -> {
             a = a.substring(a.indexOf(" ")+1);
            b = b.substring(b.indexOf(" ")+1);
            char af = a.charAt(0);
            char bf = b.charAt(0);
            if(Character.isLetter(af) && Character.isDigit(bf))
                return -1;
            if(Character.isDigit(af) && Character.isLetter(bf))
                return 1;
            if(Character.isDigit(af) && Character.isDigit(bf))
                return 0;
            return a.compareTo(b);
        });

        strList.stream().forEach(s -> System.out.println(s));
    }
}
