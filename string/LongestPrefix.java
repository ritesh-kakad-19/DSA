package string;


//  Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// Example 2:
// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings


public class LongestPrefix {
    public static void main(String[] args) {
        String arr[] = {"flower","flow","flight"};
        longestPrefix(arr);
    }

    public static void longestPrefix(String arr[])
    {
        String str1 = arr[0];

        for(int i=1; i<arr.length; i++)
        {
            String str2 = arr[i];
            //System.out.println(str1.equals(str2));

            while(str2.startsWith(str1) == false)
            {
                str1 = str1.substring(0, str1.length()-1);
                
            }

            if(str1.isEmpty())
            {
                System.out.println("");
            }
            System.out.println(str1);
        }
    }
}
