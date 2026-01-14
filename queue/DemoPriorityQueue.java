package queue;
import java.util.*;

public class DemoPriorityQueue {
    public static void main(String[] args) {

        // declare the priority queue
        //Queue <Integer> pq = new PriorityQueue<>();    // priority queue automatically gives priority to the small element

        // Comparator.reverseOrder() is used to give the priority to the big element
        Queue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); 

        //add
        pq.offer(60);
        pq.offer(30);
        pq.offer(25);
        pq.offer(40);
        pq.offer(66);

        System.out.println("priority queue: " + pq);

        // remove 
        System.out.println("removed element: " + pq.poll());
        System.out.println("priority queue: " + pq);
        System.out.println("removed element: " + pq.poll());
        System.out.println("priority queue: " + pq);

        // peek() used for print head
        System.out.println("peek element: " + pq.peek());
    }
}
