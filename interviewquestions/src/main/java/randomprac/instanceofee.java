import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution33 {

     public static void main(String[] args) {
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner s = new Scanner(System.in);
         try {
             int x = s.nextInt();
             int y = s.nextInt();
             int z = x / y;
             System.out.println(z);
         }
         catch(InputMismatchException q)
         {
             System.out.println("java.util.InputMismatchException");
         }
         catch (Exception e) {
             System.out.println(e);

         }


     }
 }
