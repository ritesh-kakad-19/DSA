package linked_list;

public class DetectLoopCycle {

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
        DetectLoopCycle obj = new DetectLoopCycle();

        Node obj1 = obj.new Node("this");
        Node obj2 = obj.new Node("is");
        Node obj3 = obj.new Node("my");
        Node obj4 = obj.new Node("new");
        Node obj5 = obj.new Node("linked");
        Node obj6 = obj.new Node("list");

        obj.head = obj1;
        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;
        obj4.next = obj5;
        obj5.next = obj6;
        obj6.next = obj3;

        //obj.printList();
        System.out.println(obj.detectLoop());
    }


    // print the list
    public void printList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }


    // detect the loop cycle in the linked list
    public boolean detectLoop(){
        Node slowNode = head;
        Node fastNode = head;

        while(fastNode != null && fastNode.next != null)
        {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            //System.out.println(slowNode.data + "    "+ fastNode.data);
            if(slowNode == fastNode){
                return true;
            }
        }
        return false;
    }


}
