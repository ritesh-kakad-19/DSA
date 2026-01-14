package queue;


// creating the queue using linked list
public class QueueUsingLinkedList {
    
    static Node head;
    static Node tail;
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[])
    {
        QueueUsingLinkedList obj = new QueueUsingLinkedList();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);

        while(!obj.isEmpty())
        {
            System.out.println(obj.peek());
            obj.remove();
        }

        
    }

    // add
    public  void add(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // remove
    public  void remove()
    {
        if(head == null)
        {
            return;
        }
        Node front = head;
        head = head.next;
        front.next = null;
    }

    // peek
    public  int peek()
    {
        return head.data;

    }

    // isEmpty
    public  boolean isEmpty()
    {
        return head == null;
    }

}
