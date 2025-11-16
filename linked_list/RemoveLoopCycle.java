package linked_list;

public class RemoveLoopCycle {
    
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        RemoveLoopCycle obj = new RemoveLoopCycle();

        Node obj1 = obj.new Node("this");
        Node obj2 = obj.new Node("is");
        Node obj3 = obj.new Node("my");
        Node obj4 = obj.new Node("new");
        Node obj5 = obj.new Node("linked");
        Node obj6 = obj.new Node("list");
        Node obj7 = obj.new Node("second");
        Node obj8 = obj.new Node("time");

        obj.head = obj1;
        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;
        obj4.next = obj5;
        obj5.next = obj6;
        obj6.next = obj7;
        obj7.next = obj8;
        obj8.next = obj5;

        
        System.out.println(obj.detectLoop());
        obj.removeLoop();
        obj.printlist();
        System.out.println(obj.detectLoop());
    }


    static Node slowNode;
    static Node fastNode;


    // detect the loop exist or not
    public boolean detectLoop()
    {
        slowNode = head;
        fastNode = head;
        while(fastNode != null && fastNode.next != null)
        {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(slowNode == fastNode)
            {
                return true;
            }
        }
        return false;
    } 


    // if loop exists the remove it
    public void removeLoop()
    {
        if(detectLoop() == false)   // if loop doesn't exist then return from function
        {
            return;
        }

        slowNode = head;       // initialze the slownode to head
        Node prevNode = null;   // prevnode initialize to null which is used to track the last node of the list
        
        while(slowNode != fastNode){
            prevNode = fastNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next;
             
        }
        prevNode.next = null;

    }


    // print the list
    public void printlist()
    {
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

}
