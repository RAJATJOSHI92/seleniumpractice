package org.example;

public class character_reverse {
    public static void main(String[] args) {

        char[] ch = {'r', 'a', 'j', 'a', 't'};
        reverseString(ch);
        System.out.println(ch);

    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

    }
}
