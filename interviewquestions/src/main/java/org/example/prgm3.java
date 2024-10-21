package org.example;


class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public void area() {
        System.out.println("Area ofn rectangle is " + height * width);
    }

    public void perimeter() {
        System.out.println("Perimeter of rectangle is " + 2 * (height + width));
    }
}

public class prgm3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(20, 30);
        r.area();
        r.perimeter();
    }
}
