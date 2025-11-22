package stack;
import java.util.*;

// reverse the string using stack
public class ReverseString {
    public static void main(String[] args) {
        String str = "abcde";
        String newstr = "";

        reverse(str, newstr);
        System.out.println("reverse string: " + reverse2(str, newstr, new Stack<>(), 0));
        
    }

    // reverse the string
    public static void reverse(String str, String newstr)
    {
        Stack <Character> s = new Stack<>();

        System.out.println("original string: "+str);
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            s.push(ch);
        }
       

        while(!s.isEmpty())
        {
            newstr = newstr + "" + s.peek();
            s.pop();
        }
        System.out.println("reverse string: "+ newstr);

    }


    // 2nd approach
    public static String reverse2(String str, String newstr, Stack <Character> s, int i)
    {
        if(i == str.length())
        {
            return newstr;
        }
        char ch = str.charAt(i);
        s.push(ch);
        i++;
        newstr = reverse2(str, newstr, s, i) +""+ s.peek();
        s.pop();
        return newstr;

    }


    public static void print(Stack <Character> s)
    {
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
