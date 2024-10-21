package org.example;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract public void show();
}

class Rectangle1 extends Shape {

    @Override
    public void show() {
        System.out.println("rectangle called ");
    }
}

class Circle extends Shape {

    @Override
    public void show() {
        System.out.println("circle called ");

    }
}

public class wildcard11 {
    public static void main(String[] args) {
        List<Rectangle1> n = new ArrayList<Rectangle1>();
        n.add(new Rectangle1());
        List<Circle> n1 = new ArrayList<Circle>();
        n1.add(new Circle());
        n1.add(new Circle());
        drawShape(n);
        drawShape(n1);


    }

    public static void drawShape(List<? extends Shape> list) {
        for (Shape s : list) {
            s.show();

        }
    }
}
