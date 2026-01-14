package queue;

import java.util.*;

// Interleave or merge two halves of queue (merge elements of two halves one by one)
// time complexity = O(n) and space complexity = O(n) because we use an extra queue
public class Interleave2Halves {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
       

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        System.out.println("original queue: "+q);


        interleave2Halves(q);
    }

    public static void interleave2Halves(Queue <Integer> q)
    {
        // divide the queue into two halves
        Queue <Integer> q2 = new LinkedList<>();
        int mid = q.size()/2;
        int count = 0;
        while(count < mid){
            q2.offer(q.peek());
            q.poll();
            count++;
        }

        System.out.println("first half: "+q2);
        System.out.println("second half: "+q);

        // interleave the queue and store it into original queue
        while(!q.isEmpty() && !q2.isEmpty())
        {
            q.offer(q2.peek());
            q2.poll();
            q.offer(q.peek());
            q.poll();
        }

        System.out.println("interleaved queue: "+q);
        
    }
}
