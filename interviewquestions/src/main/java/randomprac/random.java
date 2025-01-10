package randomprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
package randomprac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class random {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Iterator<String> i = list.iterator();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("is");
        list.add("a");
        ;
        System.out.println(list);


        while (i.hasNext()) {
            System.out.println(i.next());



        }
    }
}



*/
public class random {
    public static void main(String[] args) {
        {

            /*List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
            List<String> namess = names.stream()
                    .filter(name -> !name.equals("Bob"))
                    .collect(Collectors.toList());

            System.out.println(namess);
            System.out.println(names);*/

            List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
            List<String> namesCopy = new ArrayList<>(names);
            for (String name : namesCopy) {
                if (name.equals("Bob")) {
                    names.remove(name); // Modifies the original collection
                }
                System.out.println(namesCopy);
               System.out.println(names);

            }
        }
    }
}
