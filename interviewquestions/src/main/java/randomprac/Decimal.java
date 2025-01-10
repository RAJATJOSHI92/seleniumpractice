package randomprac;

import java.math.BigDecimal;
import java.util.*;
class Decimal {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        for(int i=0;i<n;i++)
        {
            BigDecimal big= new BigDecimal(s[i]);
            int index=i;
            for(int j=i+1;j<n;j++)
            {
                BigDecimal small= new BigDecimal(s[j]);
                if(small.compareTo(big)==1)
                {
                    big=small;
                    index=j;
                }

            }
            String temp=s[i];
            s[i]=s[index];
            s[index]=temp;


        }

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
        //Output
    }
}