package array;

public class SubarraySum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        int target = 12;

        slidingWindow(arr, target);
    }

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
}
