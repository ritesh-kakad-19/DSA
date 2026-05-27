import java.util.*;

public class MaxChainOfPairs {
    public static void main(String[] args) {
        //int arr[][] = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};
        int arr[][] = {{1,2}, {2,3}, {3,4}};

        findMaxChain(arr);
    }

    public static void findMaxChain(int arr[][])
    {
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));
        
        int count = 1;
        int b = arr[0][1];

        System.out.println(arr[0][0] +" "+ arr[0][1]);

        for(int i=1; i<arr.length; i++)
        {
            int c = arr[i][0];
            if(b < c )
            {
                count++;
                b = arr[i][1];
                System.out.println(arr[i][0] +" "+ arr[i][1]);
            }
            
        }

        System.out.println(count);
    }
}
