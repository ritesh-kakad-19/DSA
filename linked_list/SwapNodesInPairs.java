package linked_list;


// swap node in pairs 
// ex: 1 -> 2 -> 3 -> 4 -> 5 -> 6   =>  2 -> 1 -> 4 -> 3 -> 6 -> 5

public class SwapNodesInPairs {

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
        // addLast(6);

        printList();
        System.out.println();
        swapNodes();
    }

    public static void swapNodes()
    {
        if(head == null || head.next == null)
        {
            printList();
            return;
        }

        Node i=head;
        Node j=head.next;
        Node k=j.next;

        head = head.next;

        while(k != null)
        {
            j.next = i;
            if(k.next == null)
            {
                i.next = k;
                printList();
                return;
            }
            j = k.next;
            i.next = j;
            i = k;
            k = j.next;
        }

        if(i != null && j != null && k == null)
        {
            j.next = i;
            i.next = null;
        }

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
        System.out.print("null");
    }
}
