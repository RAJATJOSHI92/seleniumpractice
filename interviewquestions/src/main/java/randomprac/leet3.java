package randomprac;

import java.util.ArrayList;
import java.util.List;

public class leet3
{
    public static void main(String[] args)
    {
        String wordds[]={"rajat","ra","joshi","hi"};
        List<String> hello = substring(wordds);
         System.out.println(hello);


        for( String s:hello )
        {
            System.out.print(s +" ");
        }

    }
    public static List<String> substring(String[] words)
    {
        List<String>sub= new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(!words[j].equalsIgnoreCase(words[i]))
                {
                    if(words[i].contains(words[j]))
                    {
                        sub.add(words[j]);
                    }
                }
            }
        }
        return sub;
    }
}
