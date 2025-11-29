package stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3,5,2,8,3};
        int next_greater[] = new int[arr.length];

        nextGreaterElement1(arr, next_greater);
        nextGreaterElement2(arr, next_greater);
    }


    // brute force approach (iterative approach)    time complexity => O(n^2)
    public static void nextGreaterElement1(int arr[], int next_greater[])
    {
        for(int i=0; i<arr.length; i++)
        {
            int j = i+1;

            if(j == arr.length)
            {
                next_greater[i] = -1;
            }

            while(j<arr.length)
            {
                if(arr[j] > arr[i])
                {
                    next_greater[i] = arr[j];
                    break;
                }
                j++;
                if(j == arr.length)
                {
                    next_greater[i] = -1;
                }
            }

        }


        // print the next_greater array
        for(int i = 0; i<next_greater.length; i++)
        {
            System.out.print(next_greater[i] + " ");
        }
        System.out.println();
    }


    // approach-2 (using stack)         time complexity => O(n)
    // Because each element is pushed once and popped once from the stack.
    // Even though you see two loops, the while loop does NOT run n times for every element.

    public static void nextGreaterElement2(int arr[], int next_greater[])
    {
        Stack <Integer> s = new Stack<>();
        int n = arr.length;

        next_greater[n-1] = -1;
        s.push(arr[n-1]);

        for(int i=n-2; i>=0; i--)
        {
            while(!s.isEmpty() && s.peek() <= arr[i])
            {
                s.pop();
            }

            if(s.isEmpty()){
                next_greater[i] = -1;
                s.push(arr[i]);
            }

            if(s.peek() > arr[i])
            {
                next_greater[i] = s.peek();
                s.push(arr[i]);
            }
            
        }

        // print the next_greater array
        for(int i = 0; i<next_greater.length; i++)
        {
            System.out.print(next_greater[i] + " ");
        }
        System.out.println();
    }
}
