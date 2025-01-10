package randomprac;

import java.sql.PreparedStatement;

public class func
{
    public static void main(String[] args)
    {
        String result = func.name("rajatt");
        System.out.println(result);
    }

    public static String name(String namee)
    {
        String s="";
        if(namee=="rajat")
        {
            s="joshi";
        }
        else
        {
            s="mera name";
        }
        return  s;
    }

}
