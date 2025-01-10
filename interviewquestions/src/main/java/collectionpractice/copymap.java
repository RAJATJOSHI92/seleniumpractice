package collectionpractice;


import java.util.HashMap;
import java.util.Map;

public class copymap
{
  static <K, V> Map<K,V> copymapp(Map<K,V> ee)
  {
      Map<K,V> Ssecond= new HashMap<>();
      Map<K,V> Ssecond2= new HashMap<>();
       for(Map.Entry<K,V> entry:ee.entrySet())
       {
           Ssecond.put(entry.getKey(),entry.getValue());

       }
               Ssecond2.putAll(ee);// 3rd way

       return Ssecond;
  }
    public static void main(String[] args)
    {
        Map<Integer,String> mp= new HashMap<>();
        mp.put(1,"rajat");
        mp.put(2,"joshi");
        mp.put(3,"canada");
        Map<Integer, String> seco = copymapp(mp);
        System.out.println(seco);
        Map<Integer, String> seco2=mp;// second way assigned ;
        System.out.println(seco2);
        Map<Integer, String> seco3 = copymapp(mp);// 3rd way
        System.out.println(seco3);
    }
}
