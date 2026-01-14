package set;

import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1 [] = {7,3,9};
        int arr2 [] = {6,3,9,2,9,4};

        unionAndIntersection(arr1, arr2);
    }

    public static void unionAndIntersection(int arr1[], int arr2[])
    {
        HashSet <Integer> hs = new HashSet<>();


        // intersection
        int intesectionCount = 0;
        for(int i=0; i<arr1.length; i++)
        {
            hs.add(arr1[i]);
        }

        System.out.print("Intersection: ");
        for (int i=0; i<arr2.length; i++)
        {
            if(hs.contains(arr2[i]))
            {
                System.out.print(arr2[i]+" ");
                intesectionCount++;
                hs.remove(arr2[i]);
            }
            
        }
        System.out.println("    , Intersection count: "+ intesectionCount);


        // union 
        for(int i=0; i<arr1.length; i++)
        {
            hs.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++)
        {
            hs.add(arr2[i]);
        }
        System.out.println("Union: "+ hs +"    , Union count: "+ hs.size());
    }
}
