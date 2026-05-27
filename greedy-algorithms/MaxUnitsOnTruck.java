import java.util.Arrays;
import java.util.Comparator;


//  same question like Fractional Knapsack
public class MaxUnitsOnTruck {
    public static void main(String[] args) {
       int boxTypes[][] = {{1,3},{2,2},{3,1}};
       int truckSize = 4;

       System.out.println(maximumUnits(boxTypes, truckSize));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) 
    {
        
        Arrays.sort(boxTypes, Comparator.comparingDouble(o -> o[1]));

        for(int i=0; i<boxTypes.length; i++)
        {
            for(int j=0; j<boxTypes[0].length; j++)
            {
                System.out.print(boxTypes[i][j]+" ");
            }
            System.out.println();
        }

        int capacity = truckSize;
        int ans = 0;

        for(int i=boxTypes.length-1; i>= 0; i--)
        {
            if(capacity >= boxTypes[i][0])
            {
                ans += boxTypes[i][0] * boxTypes[i][1];
                capacity -= boxTypes[i][0];
            }
            else
            {
                ans += (boxTypes[i][1]) * capacity;
                break;
            }
        }

        return ans;
    }

}
