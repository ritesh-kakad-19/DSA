package set;

import java.util.*;

public class DemoSet {
    public static void main(String[] args) {
        // 1. hashset
        Set <Integer> set = new HashSet<>();    // Set does not allow duplicates, and it does not preserve the order of elements 
                                                // (unless you're using TreeSet or LinkedHashSet).

        // 2. LinkedHashset
        // Set <Integer> set = new LinkedHashSet<>();      // it also same as hashset but it preserve the order of elements

        // 3. TreeSet
        // Set <Integer> set = new TreeSet<>();        // it is same as Hashset but it sort the elements

        // add 
        set.add(50);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(10);

        System.out.println(set);

        // remove
        set.remove(30);
        System.out.println(set);
        
        // check the element is present or not
        System.out.println(set.contains(40));
        System.out.println(set.contains(60));

        // check the set is empty or not
        System.out.println(set.isEmpty());

        // print the size of set
        System.out.println(set.size());

        // clear the set
        set.clear();

        System.out.println(set);
    }
}
