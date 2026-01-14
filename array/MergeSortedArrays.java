package array;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int nums1[] = {0};
        int m = 0;
        int nums2[] = {5};
        int n = 1;

        merge(nums1, m, nums2, n);

        // print the nums1
        for(int i = 0; i<nums1.length; i++)
        {
            System.out.print(nums1[i] +" ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;

        int result[] = new int[m+n];

        while(i < m && j < n)
        {
            if(nums1[i] <= nums2[j])
            {
                result[k] = nums1[i];
                i++;
            } 
            else{
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

        // nums1 elemnets are remaining
        while(i < m)
        {
            result[k++] = nums1[i++];
        }

        // nums2 elemnets are remaining
        while(j < n)
        {
            result[k++] = nums2[j++];
        }

        // copy result array to num1 array
        for(int a = 0 , b = 0; a<nums1.length && b<result.length; a++, b++ )
        {
            nums1 [a] = result[b];
        }
    }
}
