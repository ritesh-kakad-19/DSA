package array;

import java.util.*;

//  Find the maximum for each and every contiguous subarray of size K.
public class MaxOfSubarray {
    public static void main(String[] args) {
        int arr[] = { 1 , 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;

        //maxElement(arr, k);
        //maxElement2(arr, k);
        maxElement3(arr, k);
        

    }

    // brute force approach
    public static void maxElement(int arr[], int k)
    {
        for(int i = 0; i<= arr.length-3; i++)
        {
            int max = 0;
            for(int j=i; j<i+3; j++)
            {
                int current = arr[j];
                max = Math.max(current, max);
            }
            System.out.print(max+" ");
        }
    }

    // sliding window
    public static void maxElement2(int arr[], int k)
    {
        int i = 0;
       

        while(i <= arr.length-3)
        {
           int max = arr[i];
            int j = i;
            while(j < i+k)
            {
                max = Math.max(max, arr[j]);
                j++;
            }
            System.out.print(max+" ");
            i++;
        }
    }

    // using deque
    public static void maxElement3(int arr[], int k)
    {
        Deque <Integer> deque = new LinkedList<>();
        deque.addFirst(arr[0]);


        int j = 1;
        for(int i=0; i<=arr.length-k; i++)
        {
            while(j < i+k)
            {
                if(arr[j] > deque.peek())
                {
                    deque.addFirst(arr[j]);
                }
                j++;
            }
            System.out.print(deque.peek() +" ");
        }
    }
}
