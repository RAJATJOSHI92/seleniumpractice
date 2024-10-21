package org.example;

import java.util.ArrayList;
import java.util.List;

public class even {
    public static void main(String[] args) {
        int count = 0;
        int count1 = 0;
        int rajat = 0;
        int addd = 0;
        List<Integer> vivek = new ArrayList<>();
        vivek.add(2);
        vivek.add(67);
        vivek.add(5);
        System.out.println(vivek);
        for (rajat = 0; rajat < vivek.size(); rajat++) {
            if (vivek.get(rajat) % 2 == 0) {
                count++;
                System.out.println("even numbers are " + vivek.get(rajat));

            } else {
                count1++;
            }
        }
        if (count > 0) {
            System.out.println("List has even ");
        } else if (count1 > 0) {
            System.out.println("List has odd");
        }


    }
}

