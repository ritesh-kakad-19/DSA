package map;

import java.util.*;

public class IterationOnMap {
    public static void main(String[] args) {
        HashMap <String, Integer> hm = new HashMap<>();

        hm.put("india", 100);
        hm.put("china", 200);
        hm.put("usa", 50);
        hm.put("uk", 30);
        hm.put("canada", 50);
        hm.put("germany", 80);
        hm.put("austrelia", 150);

        System.out.println(hm);


        // iteration on map
        Set<String> keys = hm.keySet();         // make the set of all keys 
        System.out.println(keys);

        // forEach help us to get value of keys from the hashmap
        for(String k : keys){
            System.out.println("key = "+ k + ", value = "+ hm.get(k));
        }

        
    }
}
