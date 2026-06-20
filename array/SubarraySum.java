package array;

import java.util.Arrays;

public class SubarraySum {
    public static void main(String[] args) {
        int arr[] = {1,-1,0};
        int target = 0;

        // slidingWindow(arr, target);
        // bruteForce(arr, target);
        prefixSum(arr, target);
    }


    // only works for positive elements
    public static void slidingWindow(int arr[], int target)
    {
        int i = 0;
        int j = 0;
        int sum = 0;

        while(j < arr.length)
        {
            sum = sum + arr[j];

            while(sum > target && i<j)
            {
                sum = sum-arr[i];
                i++;
            } 
            
            if(sum == target)
            {
                System.out.println(arr[i] + " to "+ arr[j]);
                return;
            }
            j++;
        }
    }

    // work for both positive and negative elemnts

    // 1) brute force approach
    public static void bruteForce(int arr[], int target)
    {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            int sum = 0;
            for(int j=i; j<arr.length; j++)
            {
                sum += arr[j];
                if(sum == target){
                    count++;
                    for(int k = i; k <= j; k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
                
            }
        }

        System.out.println("total subarrays: "+count);
    }

    // 2) prefix sum approach (optimized approach)
    public static void prefixSum(int arr[], int target)
    {
        int sum = 0;
        int prefixSum[] = new int[arr.length];
        int count = 0;

        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
            if(sum == target)
            {
                count++;

                for(int k = 0; k <= i; k++){
                        System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            prefixSum[i] = sum;
        }

        //System.out.println(Arrays.toString(prefixSum));

        
        for(int i=0; i<arr.length; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                int currSum = prefixSum[j] - prefixSum[i];
                if(currSum == target)
                {
                    count++;

                    for(int k = i+1; k <= j; k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }

        System.out.println("total subarrays: " + count);


    }
}
