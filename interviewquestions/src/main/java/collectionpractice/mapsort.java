package collectionpractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class mapsort {
    static HashMap<Integer,String> mp = new HashMap<>();

    public static  void sortmap()
    {
        ArrayList<Integer>arr= new ArrayList<>(mp.keySet());
        Collections.sort(arr);
        for(Integer ss:arr)
        {
            System.out.println("key ="+ss + "value ="+mp.get(ss));
        }

    }

    public static void main(String[] args) {


        mp.put(1,"rajat");
        mp.put(3,"rr");
        mp.put(2,"joshi");
          sortmap();
    }
}
