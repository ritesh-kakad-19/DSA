package stack;
import java.util.*;


// add the new element at the bottom of the stack
public class AddAtBottom {
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();

        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        addAtBottom(s, 6);

        while(! s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }


    // add bottom
    public static Stack<Integer> addAtBottom(Stack <Integer> s, int ele)
    {
        if( s.isEmpty())
        {
            s.push(ele);
            return s;
        }

        int top = s.peek();
        s.pop();
        addAtBottom(s, ele);
        s.push(top);

        return s;
        
    }
}
