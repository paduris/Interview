package com.kafka.experiments.consumer;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

import java.util.StringTokenizer;

/*
  Problem statement: Take a one-line string and a maximum line length integer as inputs
  and replace spaces with newlines if the word after a space would exceed the line limit.
  Only replace spaces with a newline.  Do not insert newlines in the middle of a word.
  All non-space characters can be regarded as word characters.
*/
class StringWordWrap {
    public static void main(String[] args) {
        String inputText = "Here is a sentence that is so very long that it needs to be wrapped. In fact, it is so long, it needs wrapped twice.";
        int maximumLineLength = 42;
        // note that the 'h' in the second instance of 'that' is the 42nd character,
        // so the entire second instance of 'that' was moved to the next line
        String expectedOutputText = "Here is a sentence that is so very long\n" +
                "that it needs to be wrapped. In fact,\n" +
                "it is so long, it needs wrapped twice.";

        String actualOutputText = wordWrap1(inputText, maximumLineLength);
        System.out.println(expectedOutputText.equals(actualOutputText));
        System.out.println("'" + actualOutputText + "'");





    }


//String inputText = "Here is a sentence that is so very long that it needs to be wrapped. In fact, it is so long, it needs wrapped twice.";

    public static String wordWrap(String inputText, int len)
    {
        StringBuilder builder = new StringBuilder();
        String []ar = inputText.split(" ");

        int wordLength =0;

        for (String str : ar)
        {
            str= str+" ";
            wordLength = wordLength + str.length();

            if(wordLength >=len )
            {
                builder.append("\n");
                wordLength =0;
            }
            builder.append(str);
        }
        return builder.toString().trim();
    }






    public static String wordWrap1(String in, int lim) {
        StringBuilder builder = new StringBuilder();

        String words[] = in.split(" ");

        int currentLineLength = 0;

        for (String word : words) {
            int length = word.length();

            if(currentLineLength + length + 1 >= lim) {
                builder.append("\n");
                currentLineLength = length + 1;
            } else {
                currentLineLength += length + 1;
            }
            builder.append(word).append(" ");

        }
        return builder.toString().trim();
    }
}








