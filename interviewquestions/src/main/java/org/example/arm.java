






package org.example;

import java.util.Arrays;
import java.util.Scanner;


public class arm
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.print("enter the digit :");
         int n=s.nextInt();
        System.out.print("enter the digit you want to count :");
        int n1=s.nextInt();
         int count=0;
       String string= Integer.toString(n);
        System.out.println(string);
        System.out.println(((Object)string).getClass().getSimpleName());

        for(int i=0;i<string.length();i++)
        {
          char ch   =string.charAt(i);
            int digit = Character.getNumericValue(ch);
             if (digit==n1)
             {
                 count++;
             }

        }
        System.out.println(count);






    }
}







 class arm2
{
    public static void main(String[] args)
    {
     String s="rajat";
     String temp="";
     char ch1[]={'r','a','j'};

     for(int i=s.length()-1;i>=0;i--)

     {
        char ch =s.charAt(i);
         temp= temp+ch;

     }
        System.out.println(temp);
        if(s.equals(temp))
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("no armstrong");
        }

        char vv[]=temp.toCharArray();
        String ch2 = String.valueOf(vv);
        System.out.println(ch2);
        for (char j:vv)
        {
            System.out.println(j);
        }
    }
}



