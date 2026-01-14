package queue;

import java.util.*;

// reverse the first k elements of the queue
public class ReverseFirstKElements {
    public static void main(String[] args) {
        int k = 3;
        Queue <Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);

        System.out.println(q);
        reverseKQueue(q, k);
        System.out.println(q);
    }

    public static void reverseKQueue(Queue <Integer> q, int k)
    {
        Stack <Integer> s = new Stack<>();
        Queue <Integer> q2 = new LinkedList<>();
        int count = 1;

        while(count <= k){
            s.push(q.peek());
            q.poll();
            count ++;
        }

        while(!q.isEmpty()){
            q2.offer(q.peek());
            q.poll();
        }

        while(!s.isEmpty())
        {
            q.offer(s.peek());
            s.pop();
        }

        while(!q2.isEmpty())
        {
            q.offer(q2.peek());
            q2.poll();
        }
    }
}
