package collectionpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mappp {
    static Map getname(Integer id[], String name[]) {
        Map<Integer, String> mp = new HashMap<>();
        {
            for (int i = 0; i < id.length; i++) {
                mp.put(id[i], name[i]);
            }
        }
        return mp;
    }

    public static void main(String[] args) {
        Integer a[] = {1, 2, 3, 4, 5};
        String name[] = {"rajat", "joshi", "ra", "ja", "jj"};
        Map mm = getname(a, name);
       // System.out.println(mm.get(2));
        System.out.println("Enter the key to the value associated with key");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        switch (number) {
            case 1:
                System.out.println(mm.get(1));
                break;
            case 2:
                System.out.println(mm.get(2));
                break;
            case 3:
                System.out.println(mm.get(3));
                break;
            case 4:
                System.out.println(mm.get(4));
                break;
            case 5:
                System.out.println(mm.get(5));
                break;
            default:
                System.out.println("number exceeded");


        }
    }
}
