package org.example;

public class prime {
    public static void main(String[] args) {
        int n = 35;
        boolean flag = true;
        for (int i = 2; i <= n; i++) {
            int sqrt = (int) Math.sqrt(i);
            for (int j = 2; j <= sqrt; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag)
                System.out.println(i + "prime number");
            flag = true;
        }

    }

}
