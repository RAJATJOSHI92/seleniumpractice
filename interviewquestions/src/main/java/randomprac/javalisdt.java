import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution2222 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            l.add(x);
        }

        int m = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < m; i++) {
            String s = scan.nextLine();
            if (s.equals("Insert")) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                l.add(a, b);
                if (scan.hasNextLine()) {
                    scan.nextLine();
                }
            } else if (s.equals("Delete")) {
                int x = scan.nextInt();
                l.remove(x);
                if (scan.hasNextLine()) {
                    scan.nextLine();
                }
            }
        }

        for (Integer element : l) {
            System.out.print(element + " ");
        }
    }
}