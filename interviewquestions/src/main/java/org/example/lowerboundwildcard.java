package org.example;

import java.util.Arrays;
import java.util.List;


public class lowerboundwildcard {
    public static void main(String[] args) {
        List<Integer> oo = Arrays.asList(2, 3, 4, 5, 6);
        List<Number> ooo = Arrays.asList(2.0, 3.0, 4.0);
        addnumber(oo);
        addnumber(ooo);

    }

    public static void addnumber(List<? super Integer> ll) {
        for (Object o : ll) {
            System.out.print(" " + o);
        }
        System.out.println();
    }
}
