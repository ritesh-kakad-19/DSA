package sliding_window;


// Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

public class MinimumSubarraySum {
    public static void main(String args[])
    {
       int target = 1,  nums []= {1};
       findSubarray(nums, target);
    }

    public static void findSubarray(int nums[], int target)
    {
        int i=0,  j=0;
        int minCount = Integer.MAX_VALUE;
        int count = 0;
        int sum = 0;

        while( j<nums.length)
        {
            if(sum > target)
            {
                sum -= nums[i];
                i++;
                count--;
            }
            else if(sum < target){
                sum += nums[j];
                j++;
                count++;
            }

            if(sum == target)
            {
                minCount = Math.min(minCount, count);
                sum -= nums[i];
                i++;
                count--;
            }
            
        }

        while(i<nums.length)
        {
            if(sum == target)
            {
                minCount = Math.min(minCount, count);
            }

            sum -= nums[i];
            i++;
            count--;
        }

        System.out.println(minCount);
    }
}
