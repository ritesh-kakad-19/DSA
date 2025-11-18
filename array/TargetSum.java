package array;

public class TargetSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7,15};
        int target = 17;

        findElement(arr, target);
    }

    public static void findElement(int arr[], int target)
    {
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            if(arr[start] + arr[end] == target)
            {
                System.out.println(arr[start] + "    "+ arr[end]);
                return;
            }

            if(arr[start]+arr[end] < target)
            {
                start++;
            }else{
                end--;
            }
        }
        System.out.println("not found");
    }
}
