
// complete

import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        activityselection(start, end);
    }

    public static void activityselection(int start[], int end[])
    {
        List<Integer> list = new ArrayList<>();
        int maxAct = 1;
        int prevEnd = end[0];
        list.add(0);

        for(int i=1; i<end.length; i++)
        {
            if(prevEnd <= start[i])
            {
                maxAct++;
                list.add(i);
                prevEnd = end[i];
            }
        }

        System.out.println("maximum activities:"+ maxAct);

        for(int i=0; i<list.size(); i++)
        {
            System.out.print("A"+ list.get(i) +" ");
        }

    }
}
