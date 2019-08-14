package com.inteview.question;


public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String v ="(()())(())(()(()))";
        RemoveOutermostParentheses obj = new RemoveOutermostParentheses();
        System.out.println(obj.removeOuterParentheses1(v));
    }

    public String removeOuterParentheses(String S) {
        StringBuilder builder = new StringBuilder();
        String[] split = S.split("");
        int i = 0;
        while (i < split.length - 1) {
            if (!split[i].equals(split[i + 1])) {
                if (split[i].equals("(") && split[i + 1].equals(")")) {
                    builder.append(split[i] + split[i + 1]);
                    i = i + 2;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        System.out.println(builder.toString());
        return builder.toString();
    }

    public String removeOuterParentheses1(String S) {

        StringBuilder sb = new StringBuilder();
        int open=0, close=0, start=0;
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '(') {
                open++;
            } else if(S.charAt(i) == ')') {
                close++;
            }
            if(open==close) {
                sb.append(S.substring(start+1, i));
                start=i+1;
            }
        }
        return sb.toString();

    }
}
