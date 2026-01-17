package sorting;





// insertion sort means pick an element fron right unsorted part and place in left sorted part
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,3,4,1,2};

        insertionSort(arr);
    }

    public static void insertionSort(int arr[])
    {
        int n = arr.length;
        for(int i=1; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                if(arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
