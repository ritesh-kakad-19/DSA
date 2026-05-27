package linked_list;
class Demo
{
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[])
    {
        Demo obj = new Demo();
        obj.addNode(1);
        obj.addNode(2);
        obj.addNode(3);
        obj.addNode(4);
        obj.addNode(5);

        obj.printLL();
    }

    public void addNode(int data)
    {
        Node newNode = new Node(data);
        Node currNode = head;

        if(head == null)
        {
            head = newNode;
            return;
        }
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printLL()
    {
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
    }
}