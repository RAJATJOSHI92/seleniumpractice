package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class genericmap {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "rajat");
        mp.put(2, "joshi");
        mp.put(2, "kkkk");
        Set<Map.Entry<Integer, String>> ee = mp.entrySet();
        Iterator<Map.Entry<Integer, String>> aa = ee.iterator();
        while (aa.hasNext()) {
            Map.Entry<Integer, String> aaa = aa.next();
            System.out.println(aaa.getKey() + " " + aaa.getValue());
        }
    }
}
