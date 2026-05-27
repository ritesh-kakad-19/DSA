import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int weight[] = {10, 30, 20};
        int value[] = {60, 120, 100};
        int w = 50;

        findMaxValue(weight, value, w);
    }

    public static void findMaxValue(int weight[], int value[], int w)
    {
        // find ratio
        int ratio[] = new int[weight.length];
        for(int i=0; i<ratio.length; i++)
        {
            ratio[i] = value[i]/weight[i];
            System.out.print(ratio[i]+" ");
        }
        System.out.println();

        // sort in acsending order
        int darr[][] = new int[weight.length][4];
        for(int i=0; i<weight.length; i++)
        {
            darr[i][0] = i;
            darr[i][1] = weight[i];
            darr[i][2] = value[i];
            darr[i][3] = ratio[i];
        }

        Arrays.sort(darr, Comparator.comparingDouble(o -> o[3]));

        // print 2d array
        for(int i=0; i < darr.length; i++)
        {
            for(int j=0; j < darr[0].length; j++)
            {
                System.out.print(darr[i][j]+" ");
            }
            System.out.println();
        }



        // find max value which having weight = w

        int capacity = w;
        int val = 0;
        for(int i = ratio.length-1; i >= 0; i--)
        {
            if(capacity >= darr[i][1])
            {
                val += darr[i][2];
                capacity -= darr[i][1];
            }
            else{
                val += (capacity * darr[i][3]);
                break;
            }
        }


        System.out.println(val);


    }
}
