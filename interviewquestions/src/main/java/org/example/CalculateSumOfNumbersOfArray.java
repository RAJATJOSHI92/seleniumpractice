package org.example;

public class CalculateSumOfNumbersOfArray {

    public int calculateSumOfNumbers() {

        int[] a = {10, 20, 30, 40};

        int sum = 0;

        for (int arr : a) {

            sum = sum + arr;

        }

        return sum;
    }

    public static void main(String[] args) {

        CalculateSumOfNumbersOfArray obj = new CalculateSumOfNumbersOfArray();
        int sm = obj.calculateSumOfNumbers();
        System.out.println(sm);
    }
}