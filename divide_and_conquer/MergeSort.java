package divide_and_conquer;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {7,8,2,4,6,7,3,1};
        sort(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void sort(int arr[], int start, int end)
    {
        if(start == end)
        {
            return;
        }
        int mid = (start + end)/2;

        // left
        sort(arr, start, mid);

        // right
        sort(arr, mid+1, end);

       // merge
       merge(start, mid, end,  arr);
    }

    public static void merge(int start , int mid ,int end, int arr[])
    {
        int temp[] = new int [(end - start)+1];
        int k = 0;
        int i = start;
        int j = mid+1;

        while(i <= mid && j <= end){
            if( arr[j] <  arr[i]){
                temp[k] = arr[j];
                j++;
            }
            else{
                temp[k] = arr[i];
                i++;
            }
            k++;
        }

        while( i<= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        while( j<= end){
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(i=start, k=0; k<temp.length; i++,k++)
        {
            arr[i] = temp[k];
        }

    }
}
