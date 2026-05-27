package string;
import java.util.*;

public class RemoveStars {
    public static void main(String[] args) {
        String str = "erase*****";
        removeStars(str);
    }

    public static void removeStars(String str)
    {
        StringBuilder str3 = new StringBuilder();
        str3.deleteCharAt(str3.length()-1);
        
        String str2 = "";
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(!stk.isEmpty() && ch == '*')
            {
                stk.pop();
            }
            else{
                stk.push(ch);
            }
        }

        while(!stk.isEmpty())
        {
            str2 = stk.peek()+""+str2;
            stk.pop();
        }

        System.out.println(str2);
    }
}
