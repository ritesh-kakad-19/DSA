package queue;

import java.util.*;

public class demoQueue {
    public static void main(String[] args) {
        
        // declare the queue using linked list
        Queue <Integer> queue = new LinkedList<>();

        // add into queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        // print the queue
        System.out.println("queue: " + queue);
        System.out.println("size of queue: " + queue.size());

        // remove from queue
        System.out.println("removed element: " + queue.poll());
        System.out.println("removed element: " + queue.poll());
        System.out.println("queue: " + queue);

        // print the head of the queue
        System.out.println("peek element: " + queue.peek());

        

    }
}
