package queue;

import java.util.Stack;

public class QueueUsingTwoStacks {

    static Stack <Integer> s1 = new Stack<>();
    static Stack <Integer> s2 = new Stack<>();
    public static void main(String[] args) {

        add(1);
        add(2);
        add(3);
        add(4);
        add(5);

        while(!isEmpty())
        {
            System.out.println(peek());
            remove();
        }
        
    }

    // add
    public static void add(int data)
    {
        if(s1.isEmpty())
        {
            s1.push(data);
            return;
        }
        
        while(!s1.isEmpty())
        {
            int top = s1.peek();
            s1.pop();
            s2.push(top);
        }

        s1.push(data);

        while(!s2.isEmpty())
        {
            s1.push(s2.peek());
            s2.pop();
        }
    }

    // remove
    public static void remove()
    {
        
        s1.pop();
    
    }

    // peek
    public static int peek()
    {
       
        return s1.peek();
    }

    // isEmpty
    public static boolean isEmpty()
    {
        if(s1.isEmpty())
        {
            return true;
        }
        return false;
    }
}
