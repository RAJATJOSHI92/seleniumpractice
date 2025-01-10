//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solutioneee{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer>dict= new HashMap<>();
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
             dict.put(name,phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(dict.containsKey(s)){
                System.out.println(s+"="+dict.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}



