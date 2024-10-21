package org.example;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a + b;//a=30
        b = a - b;// 30-20 b=10
        a = a - b;
        System.out.println("after swapping value of b " + b);

        System.out.println("after swapping value of a " + a);

    }
}
