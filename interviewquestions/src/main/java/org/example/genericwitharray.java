package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class genericwitharray {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("rajat");
        s.add("joshi");
        Iterator<String> aa = s.iterator();
        while (aa.hasNext()) {
            System.out.println(aa.next());
        }
    }
}
