package map;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        
        // used to store key-value pairs. Each key must be unique, but values can be duplicated.
        // In the hashmap insert, delete, search operation runs in O(1) time complexity
        // HashMap is a unordered maps in java

        // 1) declare hashmap (unorderd and keys are unique , value may be duplicate)
        Map <String ,Integer > map = new HashMap<>();

        // 2) LinkedHashMap (same as hashmap but keeps the insertion order beacause it uses the doubly linked list to maintain the order)
        //LinkedHashMap <String, Integer> map = new LinkedHashMap<>();

        // 3) TreeMap (the keys are sorted in ascending order or alphabetically)
        //TreeMap <String , Integer> map = new TreeMap<>();


        // add 
        map.put("ritesh", 1);
        map.put("aryan", 2);
        map.put("abhay", 7);
        map.put("rohan", 5);
        map.put("sham", 6);

        System.out.println(map);

        // update using put (we can update value only not key)
        map.put("rohan", 4);    // rohan = 4
        
        System.out.println(map);

        // get (we can get value by key)
        System.out.println(map.get("ritesh"));     // 1
        System.out.println(map.get("om"));     // null
        

        // remove (removes key-value pair)
        System.out.println(map.remove("sham"));      // 6
        System.out.println(map);

        // isEmpty
        System.out.println(map.isEmpty());         // false

        // size
        System.out.println(map.size());     // 4

        // containsKey (returns true if key is present else return false)
        System.out.println(map.containsKey("ritesh"));     // true
        System.out.println(map.containsKey("om"));     // false

        // containsValue (returns true if value is present else return false)
        System.out.println(map.containsValue(4));    // true
        System.out.println(map.containsValue(5));     // false

        // clear (used to clear the hashmap)
        map.clear();
        System.out.println(map);


    }
}
