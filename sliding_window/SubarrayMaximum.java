package sliding_window;
import java.util.*;

public class SubarrayMaximum {
    public static void main(String[] args) {
        
        int arr[] = {6,5,4,3,2,1};
        int k=2;

        subarrayMax(arr, k);
    }

    public static void subarrayMax(int arr[], int k)
    {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque <Integer> dq = new ArrayDeque<>();

        int i=0; 
        int j=1;
        dq.add(arr[0]);

        while(j<k)
        {
            while(!dq.isEmpty() && dq.peekLast() < arr[j])
            {
                dq.pollLast();
            }
            dq.addLast(arr[j]);
            j++;
        }

        list.add(dq.peekFirst());

        while(j < arr.length)
        {
            if(dq.peekFirst() == arr[i])
            {
                dq.pollFirst();
            }
            i++;

            while(!dq.isEmpty() && dq.peekLast() < arr[j])
            {
                dq.pollLast();
            }
            dq.addLast(arr[j]);
            j++;

            list.add(dq.peekFirst());
        }
        
        System.out.println(list);
    }
}
