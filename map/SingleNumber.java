package map;

import java.util.HashMap;


// print the numbers which appears only single time in array
public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,1,2,4};

        findSingle(arr);
    }

    public static void findSingle(int arr[])
    {
        HashMap <Integer, Integer> hs = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            int num = arr[i];
            if(hs.containsKey(num))
            {
                hs.put(num, hs.get(num)+1);
            }
            else{
                hs.put(num, 1);
            }
        }

        for (Integer i : hs.keySet()) {
            if(hs.get(i) == 1){
                System.out.println(i);
            }
        }
    } 
}
