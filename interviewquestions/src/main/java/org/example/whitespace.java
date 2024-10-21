package org.example;

import java.util.Scanner;

public class whitespace {
    public static void main(String[] args) {
//        String str="r  r  r r ";
//        String s="";
//        StringBuilder b=new StringBuilder();
//        char[] ch = str.toCharArray();
//        for(char c:ch)
//        {
//            if(!Character.isWhitespace(c))
//            {
//             b.append(c);
//            }
//            s=b.toString();
//        }
//        System.out.println(s);

        //String str="Hello My name is rajat joshi";
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter value ");
        String sss = s1.nextLine();
        String s = "";
        StringBuilder builder = new StringBuilder();
        char[] ch = sss.toCharArray();
        for (char c : ch) {
            if (!Character.isWhitespace(c)) {
                builder.append(c);
            }
        }
        s = builder.toString();
        System.out.println("new string is " + s);
    }
}
