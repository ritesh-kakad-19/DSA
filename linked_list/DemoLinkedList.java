package linked_list;
import java.util.*;


// linked list using java collection framework
public class DemoLinkedList
{
    public static void main(String[] args) {

        // declare the linked list
        LinkedList <String> list = new LinkedList<>();

        // add()
        list.addFirst("list");
        list.addFirst("linked");
        list.addFirst("new");
        list.addFirst("is");
        list.addFirst("this");

        list.addLast("java");

        System.out.println(list);

        // get()
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        // remove()
        list.removeFirst();
        list.removeLast();
        list.remove(2);
        System.out.println(list);
    }
}
