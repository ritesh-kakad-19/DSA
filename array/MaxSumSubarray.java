package array;

// find the subarray of size k which have maximum sum
public class MaxSumSubarray {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k=3;

        //findMaxSum(arr, k);
        slidingWindow(arr, k);      // constant window
    }


    // brute force approach
    public static void findMaxSum(int arr[], int k)
    {
        int n = arr.length;
        int maxSum = 0;
        for(int i=0; i<= n-k; i++)
        {
            int currSum = 0;
            for(int j=i; j<i+k; j++)
            {
                currSum += arr[j]; 
            }
            System.out.println(currSum);

            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println(maxSum);
    }


    // sliding window approach
    public static void slidingWindow(int arr[], int k)
    {
        int n = arr.length;

        // find sum of first window
        int maxSum = 0;
        int currSum = 0;

        for(int i=0; i<k; i++)
        {
            currSum += arr[i]; 
        }
       
        maxSum = currSum;

        // apply sliding window(shift the window by one position)
        int l = 0; 
        int r = k-1;
        while(r < n-1)
        {
        
           currSum -= arr[l];
           l++;
           r++;
           currSum += arr[r];

           maxSum = Math.max(maxSum, currSum);
           
        }
        System.out.println(maxSum);

    }
}
