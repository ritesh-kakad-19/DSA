package string;

// leetcode problem no. 5
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "babad";
        longestSubstring(str);
        longestSubstring2(str);

    }

    // brute force approach

    // print the longest palindromic substring 
    public static void longestSubstring(String str)
    {
        String ans = "";
        for(int i=0; i<str.length(); i++)
        {
            String curr = "";
            for(int j=i; j<str.length(); j++)
            {
                curr = curr + "" + str.charAt(j);
                if(isPalindrome(curr) && curr.length() > ans.length())
                {
                    ans = curr;
                }
            }
        }

        System.out.println(ans);
    }

    // check current substring is palindrome or not
    public static boolean isPalindrome(String str)
    {
        int i = 0;
        int j = str.length()-1;

        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }


    // optimized approach

    static int maxLength = 0;
    static int start = 0;

    public static void longestSubstring2(String str)
    {
        
        for(int i=0; i<str.length(); i++)
        {
            // odd
            expand(i, i, str);

            // even
            expand(i, i+1, str);
        }

        System.out.println(str.substring(start, start + maxLength));
    }

    public static void expand(int left, int right, String str)
    {
        int currLength = 0;
        while(left >=0 && right < str.length() && str.charAt(left) == str.charAt(right))
        {
        
            currLength = right-left+1;

            if(currLength > maxLength)
            {
                maxLength = currLength;
                start = left;
            }

            left--;
            right++;

        }
    }
}
