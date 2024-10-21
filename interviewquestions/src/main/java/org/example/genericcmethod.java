package org.example;

public class genericcmethod {
    public static void main(String[] args) {
        Integer[] intarray = {1, 2, 3, 4, 5, 6};
        Character[] chararray = {'r', 'a', 'j', 'a', 't'};
        System.out.print("printing array  :");
        Printarray(intarray);
        System.out.print("printing character  :");
        Printarray(chararray);

    }

    public static <E> void Printarray(E[] element) {
        for (E e : element) {
            System.out.print(e);
        }
        System.out.println();
    }
}
