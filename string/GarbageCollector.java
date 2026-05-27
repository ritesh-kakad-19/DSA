package string;

public class GarbageCollector {
    public static void main(String args[])
    {
        String garbage[] = {"G", "p", "GP", "GG"};
        int travel[] = {2,4,3};
        collectGarbage(garbage, travel);
    }

    public static void collectGarbage(String garbage[], int travel[])
    {
        int timeOfG = 0;
        int timeOfP = 0;
        int timeOfM = 0;
        for(int i=0; i<garbage.length; i++)
        {
            String str = garbage[i];
            int travelTime = 0;
            if(i != 0)
            {
                travelTime = travel[i-1];
            }

            int currentTime = calculateTime(str, travelTime);

        }
    }

    public static int calculateTime(String str, int travelTime)
    {
        return 0;
    }
}
