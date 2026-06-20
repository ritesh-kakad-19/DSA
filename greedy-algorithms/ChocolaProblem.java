import java.util.*;

public class ChocolaProblem {
    public static void main(String[] args) {
        
        int n = 3;
        int m = 3;

        int vertCost[] = {1,3};
        int horCost[] = {5};

        findMinCost(n, m, vertCost, horCost);
    }

    public static void findMinCost(int n, int m, int vertCost[], int horCost[])
    {
        Arrays.sort(vertCost);
        Arrays.sort(horCost);

        int i = vertCost.length-1;
        int j = horCost.length-1;


        int vertPart = 1;
        int horPart = 1;
        int minCost = 0;
        

        // vertical and horizontal cuts in order (greater cost first)
        while(i >= 0 && j >= 0)
        {
            if(vertCost[i] > horCost[j])
            {
                minCost += horPart * vertCost[i];
                vertPart++;
                i--;
            }
            else{
                minCost += vertPart * horCost[j];
                horPart++;
                j--;
            }

            System.out.println("min cost: "+minCost +"  vertpart: "+vertPart+"  horPart: "+ horPart);
        }

        //  remaining vertical cuts
        while(i >= 0){
            minCost += horPart * vertCost[i];
            i--;
            vertPart++;

            System.out.println("min cost: "+minCost +"  vertpart: "+vertPart+"  horPart: "+ horPart);
        }

        //  remaining horizontal cuts
        while(j >= 0){
            minCost += vertPart * horCost[j];
            j--;
            horPart++;

            System.out.println("min cost: "+minCost +"  vertpart: "+vertPart+"  horPart: "+ horPart);
        }

        System.out.println(minCost);

    }
}
