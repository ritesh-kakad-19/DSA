package map;
import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[] = {100,4,200,1,3,2};
        count(arr);
    }

    public static void count(int arr[])
    {
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            int num = arr[i];
            if(hm.containsKey(num))
            {
                hm.put(num, hm.get(num)+1);
            }
            else{
                hm.put(num, 1);
            }
        }

        int prev = 0;
        int maxcount = 0;
        Set<Integer> keys = hm.keySet();

        for (int k : keys) {
            
            if(hm.containsKey(k-1) == false)
            {
                maxcount = 1;
                prev = k;
            }
            else{
                
            }
        }
    }
}
