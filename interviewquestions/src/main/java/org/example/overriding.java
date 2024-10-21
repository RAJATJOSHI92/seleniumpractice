package org.example;

class Base {
    int a = 10;

    public void add(int a) {
        System.out.println(a);
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}


public class overriding {
    public static void main(String[] args) {
        Base b = new Base();

        b.add(33);
        b.add(20, 20);
    }
}
