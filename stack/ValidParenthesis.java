package stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String brackets = "((){}[])";
        System.out.println(checkValidParanthesis(brackets));
    }

    public static boolean checkValidParanthesis(String brackets)
    {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<brackets.length(); i++)
        {
            char ch = brackets.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[')
            {
                s.push(ch);
            }
            else{
                if(s.isEmpty())
                {
                    return false;
                }

                if(    (s.peek() == '(' && ch == ')') 
                    || (s.peek() == '[' && ch == ']') 
                    || (s.peek() == '{' && ch == '}') )
                {
                    s.pop();
                }
                else{
                    return false;
                }
            }

        } 

        if(!s.isEmpty())
        {
            return false;
        }
        return true;
    }
}
