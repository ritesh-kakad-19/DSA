package array;


public class GasStation {
    public static void main(String[] args) {
        int gas[] = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};

        System.out.println(findStart1(gas, cost));;
    }

    // approach 1
    public static int findStart1(int gas[], int cost[])
    {
        int totalgas = 0;
        int totalCost = 0;

        for(int i=0; i<gas.length; i++)
        {
            totalgas = totalgas + gas[i];
            totalCost = totalCost  + cost[i];
        }

        if(totalCost > totalgas)
        {
            return -1;
        }

        int start = 0;
        int remainGas = 0;

        for(int i=0; i<gas.length; i++)
        {
            remainGas = remainGas + gas[i] - cost[i];

            if(remainGas < 0)
            {
                start = i+1;
                remainGas = 0;
            }
            
        }

        return start;
    }





    // approach 2
    public static int findStart(int gas[], int cost[])
    {
        int start = getStart(gas, cost);
        if(start == -1)
        {
            return -1;
        }
        //System.out.println(start);

        
        int i = start+1;
        if(i == gas.length)
        {
            i = 0;
        }

        int newgas = gas[start] - cost[start] + gas[i];
        
        while(i != start)
        {
            if(newgas < cost[i])
            {
                return -1;
            } 

            int remainGas = newgas - cost[i];
            if(i+1 == gas.length )
            {
                i = 0;
            }
            else{
                i++;
            }
            newgas = remainGas + gas[i];
            
        }

        return start;
    }

    public static int getStart(int gas[], int cost[])
    {
        for(int i = 0; i<gas.length; i++)
        {
            if(gas[i] > cost[i])
            {
                return i;
            }
        }

        return -1;
    }
}
