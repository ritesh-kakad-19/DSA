package sorting;

public class CountingSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,8,2,2,9,3,1,2};

        countingSort(arr);
    }

    public static void countingSort(int arr[])
    {

        // find max
        int max = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            max = Math.max(max, arr[i]);
        }

        // find count array
        int count[] = new int[max+1];
        for(int i=0; i<arr.length; i++)
        {
            count[arr[i]] += 1;
        }


        // sort 
        int k=0;
        for(int i=0; i<count.length; i++)
        {
            while(count[i] >= 1)
            {
                arr[k] = i;
                count[i] -= 1;
                k++;
            }
        }

        // print array
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
