package collectionpractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class keycheck {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("rajat",1);
        mp.put("joshi",2);

        String keypresent="rajat";
        System.out.println(mp);
        boolean iskeypresent=false;
        int value=0;
        boolean iskeypresent1 = mp.containsKey(keypresent);//second way
        Iterator<Map.Entry<String, Integer>> interator = mp.entrySet().iterator();

        while (interator.hasNext())
        {
            Map.Entry<String, Integer> next = interator.next();

            if(next.getKey().equals(keypresent))
            {
                iskeypresent=true;
               value = next.getValue();
            }
        }

        System.out.println("Is "+keypresent+" available in the Hashmap :" +iskeypresent);
        System.out.println("value of "+keypresent+" is : "+value+"\n");

        System.out.println("Is "+keypresent+" available in the Hashmap :" +iskeypresent1);

    }
}
