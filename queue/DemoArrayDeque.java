package queue;
import java.util.*;

public class DemoArrayDeque {
    public static void main(String[] args) {
        
        // declare the arraydeque
        ArrayDeque <Integer> adq = new ArrayDeque<>();


        // add(addlast) and addfirst
        adq.offer(12);
        adq.offerFirst(25);
        adq.offerLast(30);
        adq.offer(19);

        System.out.println("ArrayDeque: " + adq);

        // print first or last element ( peek() and peekFirst() are same)
        System.out.println("peek element: " + adq.peek());
        System.out.println("peek first: " + adq.peekFirst());
        System.out.println("peek last: " + adq.peekLast());
        System.out.println("ArrayDeque: " + adq);

        // remove first or last ( poll() and pollFirst() are same)
        System.out.println("poll: " + adq.poll());
        System.out.println("poll first: " + adq.pollFirst());
        System.out.println("poll last: "+ adq.pollLast());
        System.out.println("ArrayDeque: " + adq);
    }
}
