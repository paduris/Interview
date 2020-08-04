package topics.recursion;

public class StringReverse {

    public static void main(String[] args) {

        String value = "Suresh";
        printReverse(value.toCharArray());
        //reverseString3(value);
    }

    private static void printReverse(char[] str) {
        helper(0, str);
    }

    private static void helper(int index, char[] str) {

        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.print(str[index]);
    }

    private static void reverseStringB(String value) {
        StringBuilder builder = new StringBuilder();

        char[] chars = value.toCharArray();

        for (int i = chars.length - 1; i != -1 && i <= chars.length - 1; i--) {

            builder.append(chars[i]);
        }
        System.out.println(builder.toString());
    }

    private static String reverseString3(String value) {

        char[] chars = value.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[end];
            chars[end] = chars[start];
            chars[start] = temp;

            start++;
            end--;
        }
        System.out.println(String.valueOf(chars));
        return String.valueOf(chars);
    }


    public String reverseString(String s) {


        char c [] = s.toCharArray();
        int start =0;
        int end=c.length-1;

        while(start < end)
        {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;

            start++;
            end--;
        }

        return String.valueOf(c);
    }
}
