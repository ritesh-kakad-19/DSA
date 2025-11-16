package linked_list;

public class creatingLinkedList {

    Node head;
    public class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        creatingLinkedList obj = new creatingLinkedList();
        obj.addFirst("list");
        obj.addFirst("linked");
        obj.addFirst("new");
        obj.addFirst("is");
        obj.addFirst("this");
        obj.printList();
        
        obj.reverseList();
        obj.printList();
    }

    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        Node currNode = head;

        head = newNode;
        newNode.next = currNode;

    }

    public void printList()
    {
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // reverse the linked list
    public void reverseList()
    {
        Node prevNode = head;
        Node currNode = prevNode.next;

        while(currNode != null)
        {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            
        }
        head.next = null;
        head = prevNode;
    }
}
