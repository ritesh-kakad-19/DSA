package linked_list;

public class MiddleNode {

    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        MiddleNode obj = new MiddleNode();
        obj.addFirst("list");
        obj.addFirst("linked");
        obj.addFirst("new");
        obj.addFirst("my");
        obj.addFirst("is");
        obj.addFirst("this");

        obj.printList();
        obj.middleNode();
    }

    public void addFirst(String data)
    {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void printList()
    {
        Node currNode = head;

        while(currNode != null)
        {
            System.out.print(currNode.data+ " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void middleNode()
    {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.data);
    }
}
