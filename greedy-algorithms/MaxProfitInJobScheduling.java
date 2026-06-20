import java.util.*;


// leetcode problem no. 1235   (Dynamic programming)
// incomplete
public class MaxProfitInJobScheduling {
    public static void main(String[] args) {
        int startTime[] = {1,2,3,4,6};
        int endTime[] = {3,5,10,6,9};
        int profit[] = {20,20,100,70,60};

        findMaxProfit(startTime,endTime, profit);
    }

    public static void findMaxProfit(int startTime[]. int endTime[], int profit[])
    {
        int pairs[][] = new int[startTime.length][3];
        for(int i=0; i<startTime.length; i++)
        {
            pairs[i][0] = startTime[i];
            pairs[i][1] = endTime[i];
            pairs[i][2] = profit[i];
        }

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[2]));

        int n = pairs.length-1;

        int startTime = pairs[n][0];
        int endTime = pairs[n][1];
        int maxProfit = pairs[n][2];

        for(int i=n-1; i>=0; i--)
        {
            int currStart = pairs[i][0];
            int currEnd = pairs[i][1];
            int currProfit = pairs[i][2];

            if(currStart >= endTime){
                maxProfit += currProfit;
                
            }
        }
    }
}
