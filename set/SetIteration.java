package set;

import java.util.*;

public class SetIteration {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        System.out.println(set);

        // 1) using iterator interface
        Iterator<String> itr = set.iterator();

        while(itr.hasNext())
        {
            System.out.print(itr.next() +" ");
        }
        System.out.println();

        // 2) using enhanced for loop (foreach loop)
        for (String s : set) {
            System.out.print(s + " ");
        }

        
    }
}
