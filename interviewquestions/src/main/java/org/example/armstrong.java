package org.example;

public class armstrong {
    public static void main(String[] args) {

        int a = 153;
        int rem;
        int sum = 0;
        int original = a;
        while (a > 0) {
            rem = a % 10;
            sum = sum + (int) Math.pow(rem, 3);
            a = a / 10;
        }
        if (sum == original)
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");
    }
}
