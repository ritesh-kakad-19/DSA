package searching;


// find the index of target if not fount then return index where it can be inserted
public class Binarysearch {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int target = 7;

        int result = binarySearch(arr, target);
        System.out.println(result);
    }

    public static int binarySearch(int arr[], int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {
            int mid = (start+end)/2;

            if(target == arr[mid])
            {
                return mid;
            }
            else if(target < arr[mid])
            {
                end = mid-1;
            }else{
                start = start+1;
            }
        }
        return start;
    }
}
