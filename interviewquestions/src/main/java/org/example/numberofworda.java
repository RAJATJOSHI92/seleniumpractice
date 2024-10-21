package org.example;

public class numberofworda {
    public static void main(String[] args) {
        String s = "aaaaa aaaa aaaa";
        int len = s.length();
        int count = 0;
        //System.out.println(len);
        for (int i = 0; i <= len - 1; i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("number of words are " + (count + 1));
    }
}
