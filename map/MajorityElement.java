package map;
import java.util.*;

// In an integer array of size n , find all the elements that appear more than (n/3) times
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1,3};

        findMajorityElements(arr);
    }

    public static void findMajorityElements(int arr[])
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
                hm.put(num,1);
            }
        }

        Set <Integer> keys = hm.keySet();
        int threshold = arr.length/3;

        for (Integer k : keys) {
           
            if(hm.get(k) > threshold)
            {
                System.out.println("key: "+ k + " value: "+ hm.get(k));
            }
        }
    }
}
