package org.example;

public class comparestring {
    public static void main(String[] args) {
        String s = "rahul";
        String ss = "rahul";
        int len = s.length();
        int len2 = ss.length();
        int temp = 0;
        if (len == len2) {
            for (int i = 0; i <= len - 1; i++)
            {
                for (int j = i; j <= i; j++)
                {
                    char c = s.charAt(i);
                    char c1 = ss.charAt(j);
                    if (c == c1)
                    {
                        temp++;
                    }

                }

            }

        }

        if (temp != len2) {
            System.out.println("String is not same ");
        } else if (temp == len2) {
            System.out.println("String is same ");
        }

    }


}
