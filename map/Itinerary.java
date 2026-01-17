package map;
import java.util.*;


// itinerary means print the path of the cities in 
public class Itinerary {
    public static void main(String[] args) {
        HashMap <String , String> hs = new HashMap<>();

        hs.put("chennai", "bengaluru");
        hs.put("Mumbai", "delhi");
        hs.put("goa", "chennai");
        hs.put("delhi", "goa");
        

        printItineraryOrder(hs);
    }
    
    public static void printItineraryOrder(HashMap< String, String> hs)
    {
        LinkedHashSet <String> set = new LinkedHashSet<>();
        Set<String> keys = hs.keySet();

        String start = null;
        for (String k : keys) {
            if(hs.containsValue(k) == false && hs.containsKey(hs.get(k)))
            {
                set.add(k);
                start = k;
            }
        }

        for (String k : keys) {
            set.add(hs.get(start));
            start = hs.get(start);
        }

        System.out.println(set);
    }


}
