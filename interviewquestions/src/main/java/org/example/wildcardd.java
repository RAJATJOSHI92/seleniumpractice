package org.example;

import java.util.ArrayList;

class upeerwildcard {
    public static Double add(ArrayList<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum = sum + n.doubleValue();
        }
        return sum;
    }
}


public class wildcardd extends upeerwildcard {
    public static void main(String[] args) {
        ArrayList<Integer> e = new ArrayList<Integer>();
        e.add(23);
        e.add(24);
        System.out.println("display the integer adding " + add(e));
        ArrayList<Double> ee = new ArrayList<Double>();
        ee.add(22.0);
        ee.add(45.0);
        System.out.println("display the double adding " + add(ee));


    }
}
