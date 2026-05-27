package linked_list;

public class ReverseNodesInKGroups {
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
        head = reverseKGroups(head,3);
        printList();
        
        
    }

    // reverse k-group nodes
    public static Node reverseKGroups(Node head1,int k)
    {
        // check k nodes present or not

        int count = 0;
        Node temp = head1;
        while(count < k)
        {
            if(temp == null)
            {
                return head1;
            }
            temp = temp.next;
            count++;
        }

        // call recursion for reverse next group 
        Node prevNode = reverseKGroups(temp, k);

        // reverse nodes in current group
        temp = head1;
        count = 0;
        while(count < k)
        {
            Node Next = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = Next;
            count++;
        }
        return prevNode;

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
