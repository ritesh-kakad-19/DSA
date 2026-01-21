package map;

import java.util.*;


// Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,1,2,3,3};

        removeDuplicates(nums);

        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i] +" ");
        }
    }

    public static void removeDuplicates(int nums[])
    {
        LinkedHashMap <Integer, Integer> map = new LinkedHashMap<>();

        // remove the elements that appears more than twice(do not store count more than 2)
        for(int i=0; i<nums.length; i++)
        {
            int num = nums[i];

            if(map.containsKey(num))
            {
                if(map.get(num) < 2)
                {
                    map.put(num, map.get(num)+1);
                }
                
            }
            else{
                map.put(num, 1);
            }

            nums[i] = 0;
        }



        System.out.println(map);
        

        // add the elements again into array( dont add more than twice)
        Set<Integer> keys = map.keySet();

        int j=0; 
        int count = 0;
        for (Integer k : keys) {
            if(map.get(k) == 2)
            {
                nums[j] = k;
                j++;
                nums[j] = k;
                j++;

                count += 2;
            }
            else{
                nums[j] = k;
                j++;
                count++;
            }
        }

        System.out.println(count);

    }
}
