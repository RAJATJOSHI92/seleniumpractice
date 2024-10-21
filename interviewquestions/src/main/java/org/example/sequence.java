package org.example;

import java.util.Arrays;

public class sequence {
    public static void main(String[] args) {
        int[] a = {2, 7, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);


        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Sorted numbers are " + a[i]);

        }

    }
}
