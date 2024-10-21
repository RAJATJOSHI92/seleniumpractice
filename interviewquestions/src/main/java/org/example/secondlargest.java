package org.example;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 4, 2, 2, 7};
        int second_largest = 0;
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            }
            if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];

            }


        }
        System.out.println("Largest:" + largest + "\nSecond largest:" + second_largest);
    }
}

