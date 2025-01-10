import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution2222222 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ss = new ArrayList<>();
        {


            int n = s.nextInt();
            for (int i = 1; i <= n; i++) {
                int y = s.nextInt();
                ArrayList<Integer> l = new ArrayList<>();
                for (int j = 1; j <= y; j++) {

                    int z = s.nextInt();
                    l.add(z);
                }
                ss.add(l);
            }

        }
        int w = s.nextInt();
        for (int m = 0; m<w;m++)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            System.out.println(ss.get(a-1).get(b-1));
        }


    }
}



