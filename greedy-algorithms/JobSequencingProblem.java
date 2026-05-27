import java.util.*;

public class JobSequencingProblem {

    // we have given 2d array with pairs of deadline time and profit of job, we have to find out max profit by doing jobs before deadline , and one job at a time. 
    public static void main(String[] args) {
        int arr[][] = {{1,4,20}, {2,1,10}, {3,1,40}, {4,1,30}, {5,4,50}, {6,3,20}};
        findMaxProfit(arr);
    }

    public static void findMaxProfit(int arr[][])
    {
        int time = 0;
        int maxProfit = 0;
        int maxdeadline = 0;
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]));

        // print array
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // find max deadline
        for(int i=0; i<arr.length; i++)
        {
            maxdeadline = Math.max(maxdeadline, arr[i][1]);
        }

        // create sequece array and initialize with -1
        int seq[] = new int[maxdeadline];
        for(int i=0; i<seq.length; i++){
            seq[i] = -1;
        }

        // schedule the jobs
        for(int i=arr.length-1; i>= 0; i--)
        {
            int currDeadline = arr[i][1];
            int idx = arr[i][0];
            int j = currDeadline-1;
            while(j >= 0){
                if(seq[j] == -1){
                    seq[j] = idx;
                    maxProfit += arr[i][2];
                    time++; 
                    break;
                }
                j--;
            }
        }

        // print sequence array, time, and maxProfit
        System.out.println("time: "+ time);
        System.out.println("max profit: "+ maxProfit);

        for(int i=0; i<seq.length; i++)
        {
            System.out.print(seq[i]+" ");
        }
        System.out.println();


        
    }
}
