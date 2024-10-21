package org.example;

class Hello<T> {
    T obj;

    Hello(T obj) {
        this.obj = obj;
    }

    public void show() {
        System.out.println(obj);
    }
}

public class genericc {
    public static void main(String[] args) {
        Hello<String> ss = new Hello<>("rajat");
        Hello<Integer> ii = new Hello<>(20);
        ss.show();
        ii.show();
    }
}
