package array;

public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[] = {0,1};
        findMissing(arr);
       // findMissing2(arr);
    }

    public static void findMissing(int arr[])
    {
        int n = arr.length;
        int total_sum = n*(n+1) / 2;
        System.out.println(total_sum);

        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);

        System.out.println("missing number: "+ (total_sum - sum));
    }

    // approach-2

}
