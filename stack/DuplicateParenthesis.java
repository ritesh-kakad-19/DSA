package stack;

import java.util.Stack;

public class DuplicateParenthesis {
    public static void main(String[] args) {
        String str = "(a+b)";       // false
        // String str2 = "((a)+b)";    // false
        // String str3 = "((a+b))";      // true
        System.out.println(checkParenthesis(str));          //return true if string has duplicate parenthesis else return false
    }

    public static boolean checkParenthesis(String str)
    {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            int count = 0;
            if( ch != ')')
            {
                s.push(ch);
            }
            else
            {
                while( !s.isEmpty() && s.peek()!= '(')
                {
                    s.pop();
                    count ++;
                }
                s.pop();

                if(count == 0)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
