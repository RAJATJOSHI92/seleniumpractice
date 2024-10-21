package org.example;

import java.util.ArrayList;
import java.util.List;

public class arrayrev {
    public static void main(String[] args) {
        int i;
        int[] a = {12, 10, 23, 15, 12};
        List<Integer> rev = new ArrayList<>();
        int len = a.length;
        for (i = a.length - 1; i >= 0; i--) {
            rev.add(a[i]);
        }
        System.out.println(rev);
    }
}
