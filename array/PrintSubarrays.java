package array;

public class PrintSubarrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        printSubArrays(arr);
    }

    // brut force approach
    public static void printSubarrays(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                for(int k=i; k<=j; k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                
            }
            System.out.println();
            
        }
    }

    // optimized approach
    public static void printSubArrays(int[] arr) 
    {
        int n = arr.length;

        // Outer loop for the start index
        for (int start = 0; start < n; start++) 
        {
            StringBuilder currentSubarray = new StringBuilder();

            // Inner loop for the end index
            for (int end = start; end < n; end++) 
            {
                currentSubarray.append(arr[end]).append(" ");
                // Prints the contiguous part from 'start' to 'end'
                System.out.println("[" + currentSubarray.toString().trim() + "]");
            }
        }
    }
}
