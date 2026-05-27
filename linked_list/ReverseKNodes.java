package linked_list;

public class ReverseKNodes {
    static Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        addLast(6);

        printList();
        reverseKNodes(2);
        
        
    }

    // reverse k nodes
    public static void reverseKNodes(int k)
    {
        if(k > countSize() || k == 0)
        {
            System.out.println(k +" is not valid");
            return;
        }
        if(k == 1)
        {
            printList();
            return;
        }

        int count = 2;
        Node prev = head;
        Node curr = head.next;
        while(count <= k && curr.next != null)
        {
            Node Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
            Next = curr.next;
            count++;
        }
        head.next = curr;
        head = prev;

        printList();

    }

    // addLast
    public static void addLast(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            newNode.next = null;
        }

        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.next = null;
    }

    // printList
    public static void printList()
    {
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // count size
    public static int countSize()
    {
        Node currNode = head;
        int count = 0;

        while(currNode != null)
        {
            count++;
            currNode = currNode.next;
        }

        return count;
    }
}
