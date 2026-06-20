import java.util.*;

public class TopviewOfTree {
    // define nodes
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    //                1
    //               / \
    //              2   3
    //             / \   
    //            4   5   
    //                 \
    //                  6
    //                   \
    //                    7
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        HashMap<Integer, Node> map = new HashMap<>();

        topView(root, map);
        
        
    }

    static class Info{
        Node node;
        int hd;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root, HashMap<Integer, Node> map)
    {
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(root, 0));
       

        int min = 0;
        int max = 0;
        while(!q.isEmpty())
        {
            Info curr = q.peek();
            if(!map.containsKey(curr.hd))
            {
                map.put(curr.hd, curr.node);
            }
            q.poll();

            if(curr.node.left != null)
            {
                q.add(new Info(curr.node.left, curr.hd-1));
                min = Math.min(min, curr.hd-1);
            }

            if(curr.node.right != null)
            {
                q.add(new Info(curr.node.right, curr.hd+1));
                max = Math.max(max, curr.hd+1);
            }

        }

        
        System.out.println(min+" "+max);
        for(int i=min; i<= max; i++)
        {
            System.out.print(map.get(i).data +" ");
        }

    }
}
