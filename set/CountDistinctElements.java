package set;

import java.util.HashSet;


// count total distinct elements present in the arr
public class CountDistinctElements {
    public static void main(String[] args) {
        int arr[] = {4,2,1,5,1,3,6,3,2,5};

        countDistinctElements(arr);
    }

    public static void countDistinctElements(int arr[])
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++)
        {
            hs.add(arr[i]);
        }

        System.out.println(hs);
        System.out.println(hs.size());
    }
}
