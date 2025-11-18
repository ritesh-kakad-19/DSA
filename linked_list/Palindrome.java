package linked_list;

public class Palindrome {
    static Node head;
    class Node{
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
        Palindrome obj = new Palindrome();
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(3);
        obj.addLast(2);
        obj.addLast(1);

        obj.printList(head);
        System.out.println(obj.palindrome());

       
    }

    // addlast()
     public void addLast(int data)
    {
        Node newnode = new Node(data);
        Node currNode = head;
        if(head == null){
            head = newnode;
            return;
        }

        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newnode;

    }

    // print the list
    public void printList(Node head)
    {
        Node curNode = head;
        while(curNode != null)
        {
            System.out.print(curNode.data+ " -> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }


    // find midnode
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


    // reverse the LL
    public Node reverseLL()
    {
        Node midNode = midNode();
        Node reverseLL = new Node(-1);
        Node newHead = reverseLL;

        Node prevNode = midNode;
        Node currNode = prevNode.next;
        
        while(currNode != null)
        {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        newHead.next = prevNode;
        newHead = newHead.next;
        midNode.next = null;
        
        //printList(newHead);
        return newHead;

    }

    // check palindrome
    public boolean palindrome()
    {
        Node rightHead = reverseLL();
        printList(rightHead);
        Node leftHead = head;
        printList(leftHead);

        Node right = rightHead;
        Node left = leftHead;

        while(left != right && left != null && right != null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;
    }

}
