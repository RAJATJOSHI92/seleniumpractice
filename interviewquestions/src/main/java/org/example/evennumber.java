package org.example;

public class evennumber {
    public static void main(String[] args) {
        int a = 15;
        int odd = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println(i + ": is even number between " + a);
            }

        }
        for (int i = 0; i <= a; i++) {
            if (i % 2 != 0) {
                System.out.println(i + ": is odd number between " + a);
            }

        }
    }
}
