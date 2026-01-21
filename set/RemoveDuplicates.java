package set;

import java.util.*;


// remove duplicate elements from array
public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,5,8,3,2,1,3,6,8,7};
        removeDuplicates(arr);
    }

    public static void removeDuplicates(int arr[])
    {
        Set <Integer> set = new LinkedHashSet <> ();

        for(int i=0; i<arr.length; i++)
        {
            set.add(arr[i]);
            arr[i] = 0;
        }

        int j = 0;
        for (Integer i : set) {
            arr[j] = i;
            j++;
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
