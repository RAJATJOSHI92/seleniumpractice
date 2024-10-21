package org.example;

class Animal {
    int a;

    public void sound() {
        System.out.println("parent called");
    }


}

class Lion extends Animal {
    int b;

    @Override
    public void sound() {
        System.out.println("lion crowls ");
    }

    public void hello() {
        System.out.println("hello");
    }
}

class Tiger extends Animal {
    int c;

    @Override
    public void sound() {
        System.out.println("Tiger crowls ");
    }
}

public class abstarct {
    public static void main(String[] args) {
        Animal l = new Lion();
        Tiger t = new Tiger();
        t.sound();
        l.sound();

    }
}
