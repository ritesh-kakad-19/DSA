package linked_list;

public class Zigzag2LL {
    static Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    // main function
    public static void main(String[] args) {
        Zigzag2LL obj = new Zigzag2LL();

        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);
       // obj.addLast(6);

        obj.printList(head);
        obj.zigzagLL();
    }


    // addlast()
    public void addLast(int data)
    {
        Node newData = new Node(data);
        Node currNode = head;

        if(head == null)
        {
            head = newData;
            return;
        }
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newData;
    }


    // print the list
    public void printList(Node head)
    {
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;

        }
        System.out.println("null");
    }

    // find middle node
    public Node midNode()
    {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // reverse the half LL from midNode
    public Node reverseLL()
    {
        Node reverseLL = new Node(-1);
        Node newHead = reverseLL;

        Node midNode = midNode();

        Node prevNode = midNode.next;
        Node currNode = prevNode.next;
        prevNode.next = midNode;
        midNode.next = null;

        while(currNode != null)
        {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        newHead.next = prevNode;
        newHead = newHead.next;
        return newHead;

    }

    // arrange the LL in zigzag manner like (1 -> 6 -> 2 -> 5 -> 3 -> 4)
    public void zigzagLL()
    {
        Node rightHead = reverseLL();
        //printList(rightHead);

        Node leftHead = head;
        //printList(leftHead);

        Node right = rightHead;
        Node left = leftHead;

        while(left != right && left != null && right != null)
        {
            Node leftNext = left.next;
            Node rightNext = right.next;

            left.next = right;
            left = leftNext;
            right.next = left;
            right = rightNext;
        }

        printList(leftHead);
    }
}
