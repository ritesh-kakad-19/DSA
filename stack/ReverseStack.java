package stack;
import java.util.*;

public class ReverseStack {
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        
        reverse(s);
        printStack(s);
    
    }

    // reverse the stack
    public static Stack <Integer> reverse(Stack <Integer> s)
    {
        if(s.isEmpty())
        {
            return s;
        }

        int top = s.peek();
        s.pop();
        reverse(s);
        addBottom(s, top);

        return s;

        
    }


    // add the bottom of stack
    public static Stack <Integer> addBottom(Stack <Integer> s, int ele)
    {
        if(s.isEmpty())
        {
            s.push(ele);
            return s;
        }
        int top = s.peek();
        s.pop();
        addBottom(s, ele);
        s.push(top);

        return s;
    }

    // print the stack
    public static void printStack(Stack <Integer> s)
    {
        while( ! s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
