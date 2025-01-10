package collectionpractice;

import java.util.HashMap;
import java.util.Map;

public class arrtomap
{
    public static void main(String[] args)
    {
        String name="rajat:1,joshi:2,canada:3";
              String[] name2=name.split(",");
        Map<String,String>mp= new HashMap<>();
         for(String ss:name2)
         {
             String[] result = ss.split(":");
             String rollno = result[0].trim();
             String Studentname = result[1].trim();

             mp.put(Studentname,rollno);
         }
        System.out.println(mp);
    }
}
