package linked_list;

// reverse the Doubly LL
public class ReverseDLL {

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
        ReverseDLL obj = new ReverseDLL();

        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);

        obj.printList();
        obj.reverseDLL();
        obj.printList();
    }

    // reverse the DLL
    public void reverseDLL()
    {
        Node prevNode = head;
        Node currNode = prevNode.next;

        tail = prevNode;
        prevNode.prev = currNode;
        while(currNode != null)
        {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            currNode.prev = nextNode;
            prevNode = currNode;
            currNode = nextNode; 
        }
        head = prevNode;
        tail.next = null;
    }

    // add last
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

    // print the DLL
    public void printList()
    {
        Node temp1 = head;
        Node temp2 = tail;

        // print in straight order 
        System.out.print("straight order: ");
        while(temp1 != null)
        {
            System.out.print(temp1.data + " -> ");
            temp1 = temp1.next;
        }
        System.out.println("null");

        // print in reverse order
        System.out.print("reverse order: ");
        while(temp2 != null)
        {
            System.out.print(temp2.data + " -> ");
            temp2 = temp2.prev;
        }
        System.out.println("null");
    }
}
