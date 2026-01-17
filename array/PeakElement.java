package array;

public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};

        peakElement(arr);
    }

    public static void peakElement(int arr[])
    {
        int prev = 0;
        int curr = 0;
        int next = 1;

        if(arr[curr] > arr[next])
        {
            System.out.println("index: "+curr +" element: " +arr[curr]);
            curr = 1;
            next = 2;
        }

        while(curr < arr.length)
        {
            if(next == arr.length && arr[curr] > arr[prev])
            {
                System.out.println("index: "+curr +" element: " +arr[curr]);
                return;
            }

            if(arr[curr] > arr[prev] && arr[curr] > arr[next])
            {
                System.out.println("index: "+curr +" element: " +arr[curr]);
            }

            prev = curr;
            curr = next;
            next = next+1;
        }
    }
}
