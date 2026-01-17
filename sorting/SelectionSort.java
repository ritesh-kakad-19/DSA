package sorting;


// 


// selection sort means find the smallest element from unsorted part and place at the beginning of the array
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,3,1,4,2};
        selectionSort(arr);
    }

    public static void selectionSort(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            int smallest = i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[smallest] > arr[j])
                {
                    smallest = j;
                }
            }
            System.out.println(arr[smallest]);

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
