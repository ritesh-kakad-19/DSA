package array;

// removes the duplicate elements from the array


public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
       

        int k = removeDuplicates2(nums);
        System.out.println(k);

        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }

    public static int removeDuplicates2(int nums[])
    {
        int k = 0;
        int count = 0;
        for(int  i=0; i<nums.length-1; i++)
        {
            int curr = i+1;
            int prev = i;

            if(nums[curr] != nums[prev])
            {
                nums[k] = nums[prev];
                k++;
                count++;
            }
        }
        nums[k] = nums[nums.length-1];
        return count+1;
    }
}
