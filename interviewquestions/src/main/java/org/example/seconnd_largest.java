package org.example;

public class seconnd_largest {
    public static void main(String[] args) {
        int largest = 0;
        int second_largest = 0;
        int[] a = {1, 2, 45, 7, 9, 78, 90, 54, 3, 6, 79};

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                second_largest = largest;
                largest = a[i];
            } else if (a[i] > second_largest) {
                second_largest = a[i];

            }

        }

        System.out.println("Largest:" + largest + "\nSecond largest:" + second_largest);
    }

}
