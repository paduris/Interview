package com.inteview.question;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {


    public static void main(String[] a) {
        String emails[] = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};

        // String v = "test.email+alex@leetcode.com";


        UniqueEmailAddress s = new UniqueEmailAddress();
        System.out.println(s.numUniqueEmails(emails));
    }

    public int numUniqueEmails(String[] emails) {

        Set<String> emailsSet = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {

            String em[] = emails[i].split("@");

            char c[] = em[0].toCharArray();

            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < c.length; j++) {

                if (c[j] == '+') {
                    break;
                } else if (c[j] != '.') {
                    builder.append(c[j]);
                }
            }
            emailsSet.add(builder.toString() + "@" + em[1]);
        }
        return emailsSet.size();
    }
}


