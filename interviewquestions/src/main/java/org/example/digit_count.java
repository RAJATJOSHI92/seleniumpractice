package org.example;

import java.util.Scanner;

public class digit_count {
    public static void main(String[] args) {
        Scanner sss = new Scanner(System.in);
        System.out.print("enter number :");
        int number = sss.nextInt();
        int count = 0;
        System.out.print("Enter digit you want to count :");
        int digit = sss.nextInt();

        String s = Integer.toString(number);
        for (int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            int dd = Character.getNumericValue(ss);

            if (dd == digit) {
                count++;

            }
            if (count < 1) {
                System.out.println("No Such Element Exist");
                return;

            }


        }
        System.out.println(digit + " Comes " + count + " Times");
    }

}
