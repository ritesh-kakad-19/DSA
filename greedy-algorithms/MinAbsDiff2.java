import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsDiff2 {
    public static void main(String[] args) {
        int arr[] = {1,3,4,7,8,9};
        minimumAbsDifference(arr);
    }

    public static void minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int diff[] = new int[arr.length-1];
        int minVal = Integer.MAX_VALUE;

        for(int i=1; i<arr.length; i++)
        {
            int difference = Math.abs(arr[i] - arr[i-1]);
            diff[i-1] = difference;
            minVal = Math.min(minVal, difference);
        }
        
        for(int i=0; i<diff.length; i++){
            System.out.print(diff[i]+" ");
        }
        System.out.println();

        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<diff.length; i++)
        {
            List<Integer> list1 = new ArrayList<>();
            if(diff[i] == minVal){
                list1.add(arr[i]);
                list1.add(arr[i+1]);
                list.add(list1);
            }
        }

        System.out.println(list);
    }
}
