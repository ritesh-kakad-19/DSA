package array;


// incomplete
public class MaxProductSubarray {
    public static void main(String[] args) {
        
        //int nums[] = {-2};
        //int nums[] = {2,3,-2,4};
        //int nums[] = {-2,0,-1};
        int nums[] = {0,2};

        System.out.println(maxProduct(nums));
    }

     public static int maxProduct(int[] nums) {

        if(nums.length == 1)
        {
            return nums[0];
        }
        
        int left = 0;
        int right = 1;

        int maxProduct = Integer.MIN_VALUE;
        int currProduct = nums[0];

        while(right < nums.length)
        {
            currProduct *= nums[right];
            maxProduct = Math.max(currProduct, maxProduct); 
            right++;
        }

        while(left < nums.length)
        {
            if(nums[left] != 0)
            {
                currProduct = currProduct / nums[left];
            }
            
            maxProduct = Math.max(currProduct, maxProduct);
            left++;
        }

        return maxProduct;
    }
}
