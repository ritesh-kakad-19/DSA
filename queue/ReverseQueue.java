package queue;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);


        reverseQueue(q);
        System.out.println(q);
    }

    public static Queue<Integer> reverseQueue(Queue <Integer> q)
    {
        if(q.isEmpty())
        {
            return q;
        }

        int front = q.peek();
        q.poll();
        reverseQueue(q);
        q.offer(front);
        return q;
    }
}
