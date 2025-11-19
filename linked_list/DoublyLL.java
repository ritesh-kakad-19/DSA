package linked_list;

// doubly linked list
public class DoublyLL {

    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        } 
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        // dll.addFirst(5);
        // dll.addFirst(4);
        // dll.addFirst(3);
        // dll.addFirst(2);
        // dll.addFirst(1);

        dll.addLast(11);
        dll.addLast(12);
        dll.addLast(13);
        dll.addLast(14);
        dll.addLast(15);

        dll.printList();

        dll.removeFirst();
        dll.removeLast();
        dll.printList();
    }


    // add first
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // addLast
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // remove first
    public void removeFirst()
    {
       

        if(head == null)
        {
            return;
        }

        if(head.next == null)
        {
            head = null;
            tail = null;
            return;
        }

        head = head.next;
        head.prev = null;

    }

    // remove last
    public void removeLast()
    {
        if(head == null)
        {
            return;
        }

        if(head.next == null)
        {
            head = null;
            tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }


    // print the list
    public void printList()
    {
        Node temp1 = head;
        Node temp2 = tail;

        // print in the normal order
        System.out.print("straight order: ");
        while(temp1 != null)
        {
            System.out.print(temp1.data + " -> ");
            temp1 = temp1.next;
        }
        System.out.println("null");


        // print on the reverse order
        System.out.print("reverse order: ");
        while(temp2 != null)
        {
            System.out.print(temp2.data + " -> ");
            temp2 = temp2.prev;
        }
        System.out.println("null");
    }
}
