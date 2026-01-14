package stack;

public class MaxRectangleArea {
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        int max_area = maxArea(arr);
        System.out.println(max_area);
    }

    // brute force approach
    public static int maxArea(int arr[])
    {
        int max_area = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {

            int height = arr[i];
            int width = 1;

            int j = i-1;
            while(j >= 0 && arr[j] >= arr[i])
            {
                width++;
                j--;
            }

            int k = i+1;
            while(k < arr.length && arr[k] >= arr[i])
            {
                width++;
                k++;
            }

            int curr_area = height * width;
            max_area = Math.max(curr_area, max_area);
        }

        return max_area;
    }

    // stack based algorithm
    public static void maxarea2(int arr[])
    {
        
    }
}
