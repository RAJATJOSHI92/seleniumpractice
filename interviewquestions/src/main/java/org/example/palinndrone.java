package org.example;

public class palinndrone {
    public static void main(String[] args) {
        String st = "maaan";
        pal(st);

    }

    public static void pal(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {


            char ch = s.charAt(i);
            rev = rev + ch;


        }
        if (rev.equals(s)) {
            System.out.println("palindrone");
        } else {
            System.out.println(" not palindrone");
        }


    }
}
