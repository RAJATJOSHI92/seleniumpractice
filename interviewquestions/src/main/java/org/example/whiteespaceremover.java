package org.example;

public class whiteespaceremover {
    public static void main(String[] args) {
        String s = " rajat                               joshi";
        System.out.println(remover(s));
    }

    public static String remover(String ss) {
        StringBuilder sb = new StringBuilder();
        char[] ch = ss.toCharArray();
        for (char c : ch) {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }

        return sb.toString();


    }
}

