package collectionpractice;

import java.util.*;

public class maptolist {
    public static void main(String[] args) {
        Map<String,Integer> mp= new HashMap<>();
        mp.put("rajat",1);
        mp.put("joshi",2);
        mp.put("canada",3);

        Set<String> keys = mp.keySet();
        ArrayList<String> arr= new ArrayList<>(keys);

        Collection<Integer> values = mp.values();
        ArrayList<Integer> valu= new ArrayList<>(values);

        System.out.println(arr);
        System.out.println(valu);

        Set<Map.Entry<String, Integer>> entry = mp.entrySet();
        ArrayList<Map.Entry<String, Integer>> arr1= new ArrayList<Map.Entry<String, Integer>>(entry);
        System.out.println(arr1);

    }
}
