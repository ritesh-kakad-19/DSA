package set;
import java.util.*;


// return the count for longest consecutive numbers (ex. 1,2,3,4,..  this are consecutive numbers . so return the count of consecutive numbers from the array)

public class LongestConsecutiveSequence {

    // main function
    public static void main(String[] args) {
        int arr[] = {0,1,1,2};
        count(arr);
    }

    public static void count(int arr[])
    {
        TreeSet <Integer> hs = new TreeSet<>();

        int maxCount = 0;
        int count = 0;

        for(int i=0; i<arr.length; i++)
        {
            hs.add(arr[i]);
        }
        System.out.println(hs);

        for (Integer i : hs) {
            if(hs.contains(i-1))
            {
                count++;
            }
            else{
                maxCount = Math.max(count, maxCount);
                count = 1;
            }
        }
        maxCount = Math.max(count, maxCount);
        System.out.println(maxCount);
    }
}
