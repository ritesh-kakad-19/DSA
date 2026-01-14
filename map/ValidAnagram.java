package map;

import java.util.*;

// valid anagram means checking the two string which contains same letters (order may change) and same no. of letters (same length of strings)

public class ValidAnagram {

    // main function
    public static void main(String[] args) {
        String str1 = "knee";
        String str2 = "keen";

        System.out.println(checkvalidAnagram(str1, str2));
        System.out.println(checkAnagram(str1, str2));
    }


    // using single hashmap
    public static boolean checkAnagram(String str1, String str2)
    {
        HashMap <Character, Integer> hm = new HashMap<>();

        if(str1.length() != str2.length())
        {
            return false;
        }

        for (int i=0; i<str1.length(); i++)
        {
            char ch = str1.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }

        }

        for(int i=0; i<str2.length(); i++)
        {
            char ch = str2.charAt(i);

            if(hm.containsKey(ch) == false)
            {
                return false;
            }
            else if(hm.get(ch) > 1){
                hm.put(ch, hm.get(ch)-1);
            }
            else{
                hm.remove(ch);
            }
        }

        if(hm.isEmpty())
        {
            return true;
        }
        else{
            return false;
        }
    }


    // check valid anagram function (using two hashmap)  (store the characters of both string in two hashmap and then compare them)
    public static boolean checkvalidAnagram (String str1, String str2)
    {
        HashMap <Character, Integer> hm1 = new HashMap<>(); 
        HashMap <Character, Integer> hm2 = new HashMap<>(); 

        if(str1.length() != str2.length())
        {
            return false;
        }

        for(int i=0; i<str1.length(); i++)
        {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if(hm1.containsKey(ch1))    hm1.put(ch1, hm1.get(ch1)+1);
            else    hm1.put(ch1, 1);

            if(hm2.containsKey(ch2))    hm2.put(ch2, hm2.get(ch2)+1);
            else    hm2.put(ch2, 1);
            
        }

        Set <Character> keys1 = hm1.keySet();
        Set <Character> keys2 = hm2.keySet();
        System.out.println(keys1);
        System.out.println(keys2);

        for (Character k1 : keys1) {
            if(hm2.containsKey(k1) == false)
            {
                return false;
            }
            else if (hm1.get(k1) != hm2.get(k1))
            {
                return false;
            }
        }

      
        return true;

    }





}
