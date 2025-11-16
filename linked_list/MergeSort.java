package linked_list;


// merge sort on linked list
public class MergeSort {
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
    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        obj.addFirst(4);
        obj.addFirst(3);
        obj.addFirst(5);
        obj.addFirst(1);
        obj.addFirst(2);
        obj.addFirst(6);

        System.out.print("original Linked list: ");
        obj.printList();

        obj.head = obj.sort(obj.head);

        System.out.print("sorted linked list: ");
        obj.printList();

    }

    // add the nodes to LL
    public  void addFirst(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // print the LL
    public void printList()
    {
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // find middle node of LL
    public Node middleNode(Node head)
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


    // divide the LL from Middle and call for left and right part for sorting
    public Node sort(Node head)
    {
        if(head.next == null)
        {
            return head;
        }
        Node middle = middleNode(head);
        Node righthead = middle.next;
        middle.next = null;

        // left
        Node newLeft = sort(head);

        // right
        Node newRight = sort(righthead);

        // merge
        return merge(newLeft, newRight);
    }


    // sort the left and right part and the merge it
    public Node merge(Node lefthead, Node righthead)
    {
        Node mergedLL = new Node(-1);           // new LL for linking the sorted nodes  
        Node temp = mergedLL;                   // temp variable points to the mergedLL head
       
        // compare the left part nodes with right part nodes then link it with new linked list head(mergedLL)
        while(lefthead != null && righthead != null)
        {
            if(righthead.data < lefthead.data)
            {
                temp.next = righthead;
                righthead = righthead.next;
            }
            else{
                temp.next = lefthead;
                lefthead = lefthead.next;
            }
            temp = temp.next;
        }

        // link the remaining left part 
        while(lefthead != null)
        {
            temp.next = lefthead;
            temp = temp.next;
            lefthead = lefthead.next;
        }

        // link the remaining right part
        while(righthead != null)
        {
            temp.next = righthead;
            temp = temp.next;
            righthead = righthead.next;
        }
        return mergedLL.next;               // it returns the mergedLL head.next which is sorted node because head is -1
    }
}
