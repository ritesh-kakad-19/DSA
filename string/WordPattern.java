import java.util.HashMap;

public class WordPattern
{
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";

        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {

        String arr[] = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();

        int i=0;
        int j=0;

        if(pattern.length() != arr.length)
        {
            return false;
        }

        while(i<pattern.length() && j<arr.length)
        {
            char ch = pattern.charAt(i);
            if(map.containsKey(ch) && !map.get(ch).equals(arr[j]))
            {
                return false;
            }
            map.put(ch, arr[j]);
            i++;
            j++;
        }

        String str = "";
        for(int k = 0; k < pattern.length(); k++)
        {
            char ch = pattern.charAt(k);
            str = str +" "+map.get(ch);
        }

        System.out.println(s);
        System.out.println(str);

        if(!s.equals(str))
        {
            return false;
        }
        return true;
    }
}