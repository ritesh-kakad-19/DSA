package string;

import java.util.HashMap;
import java.util.Set;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "a";
        longestPalindrome(str);


    }
    public static void longestPalindrome(String s) {
        if(s.length() == 0)
        {
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }

        int ans = 0;
        Set<Character> keys = map.keySet();
        int count = 0;

        for(char k: keys)
        {
            ans += map.get(k);
            if(map.get(k) % 2 != 0)
            {
                count++;
            }
            
            
        }

        ans = (ans-count) + 1;

        System.out.println(map);
        System.out.println(ans);
    }
}
