import java.util.*;
public class SplitArrayIntoKSubarrays {
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        int k = 2;
        findSum(arr, k);
    }

    public static void findSum(int arr[], int k)
    {
        Arrays.sort(arr);
        int maxSum = Integer.MIN_VALUE;
        int i = arr.length-1;

        while(k > 1 && i >= 0)
        {
            maxSum = Math.max(maxSum, arr[i]);
            i--;
            k--;
        }

        if(k == 1 && i >= 0){
            int currSum = 0;
            while(i >= 0){
                currSum += arr[i];
                i--;
            }

            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println(maxSum);
    }
}
