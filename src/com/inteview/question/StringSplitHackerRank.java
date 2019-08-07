package com.inteview.question;


public class StringSplitHackerRank {


    private static final String reg = "[A-Za-z !,?._'@]+,";

    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";

        String[] items = s.trim().split("[ !,?.\\_'@]+");

        if(s == ""){
            System.out.println("0");
        }
        else if(s.length() > 400000){
            return;
        }
        else{
            System.out.println(items.length);
        }

        for(String item: items){
            System.out.println(item);
        }


    }
}
