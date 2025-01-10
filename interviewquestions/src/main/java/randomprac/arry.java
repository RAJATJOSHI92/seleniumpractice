import java.io.*;
import java.util.*;
class Solution44 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n= in.nextInt();
         int arr[]= new int[n];
         int count=0;
         for (int i=0;i<=arr.length-1;i++)
         {
             arr[i]=in.nextInt();
         }

       for(int i=0;i<=arr.length-1;i++)
       {
           for(int j=i;j<arr.length;j++)
           {
               int sum=0;
               sum= sum+arr[i];
               if(sum>0)
               {
                   count++;
               }
           }
       }
        System.out.println(count);
    }
}