package org.example;

import java.util.ArrayList;
import java.util.List;

public class lst {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(23);
        s.add(2);
        s.add(25);
        s.add(24);
        System.out.println(s);
        System.out.println(even(s));

    }

    public static boolean even(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0)
                return true;
        }
        return false;
    }
}

