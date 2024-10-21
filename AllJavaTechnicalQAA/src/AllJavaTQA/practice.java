package AllJavaTQA;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        //input two strings
        System.out.print("Enter first string :");
        String string1=s.nextLine();
        System.out.print("Enter Second string :");
        String string2=s.nextLine();
        //lowecase the string and replacement
        string1.toLowerCase().replaceAll("[^a-zA-Z]"," ");
        string2.toLowerCase().replaceAll("[^a-zA-Z]"," ");
        if(string1.length()!=string2.length())
        {
            System.out.println("string is not angaram");
        }
        else
        {
            //convert the string to char of arrays and sort it
            char[] char1 = string1.toCharArray();
            char[] char2 = string1.toCharArray();
                  Arrays.sort(char1);
                  Arrays.sort(char2);
                  if(Arrays.equals(char1,char2))
                  {
                      System.out.println("string is anagaram");
                  }
                  else
                  {
                      System.out.println("string is not anagaram");
                  }
        }
        s.close();
    }
}
