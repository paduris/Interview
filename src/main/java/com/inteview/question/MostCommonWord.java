package com.inteview.question;


import java.util.*;

/**
 * Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.
 * It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
 * <p>
 * Words in the list of banned words are given in lowercase, and free of punctuation.
 * Words in the paragraph are not case sensitive.
 * The answer is in lowercase.
 */
public class MostCommonWord {

    public static void main(String[] args) {
        MostCommonWord mostCommonWord = new MostCommonWord();

        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = {"a"};
        System.out.println(mostCommonWord.mostCommonWord(paragraph, banned));
    }

    public String mostCommonWord(String paragraph, String[] banned) {

        String[] splitArray = paragraph.split("\\W+");

        List<String> bannedList = Arrays.asList(banned);
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < splitArray.length; i++) {
            final String o = splitArray[i];
            String filteredString = this.removeSpecialCharactersAndPunctuation(o);
            if (!bannedList.contains(filteredString)) {
                //  System.out.println(filteredString);
                if (map.get(filteredString) == null) {
                    int count = 1;
                    map.put(filteredString, count);
                } else {
                    Integer count = map.get(filteredString);
                    count++;
                    map.remove(filteredString);
                    map.put(filteredString, count);
                }
            }
        }
        return filterMapAndReturnValue(map);
    }

    private String filterMapAndReturnValue(Map<String, Integer> map) {

        String returnVal = "";
        int max = 0;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String k = (String) it.next();
            Integer v = map.get(k);

            System.out.println(k + " -- " + v);
            if (max < v) {
                max = v;
                returnVal = k;
            }
        }
        return returnVal;
    }

    private String removeSpecialCharactersAndPunctuation(String o) {
        StringBuilder builder = new StringBuilder();
        char[] values = o.toCharArray();
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            if ((value >= 97 && value <= 122) || (value >= 65 && value <= 90)) {
                builder.append(values[i]);
            }
        }
        return builder.toString().toLowerCase();
    }
}
