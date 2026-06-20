import java.util.*;

public class KthLevelOfTree {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //                 1
    //               /   \
    //              2     3
    //             / \   / \
    //            4   5 6   7

    public static void main(String args[])
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // approach 1
        kthLevel(root, 3);

        // approach 2
        ArrayList<Integer> list = new ArrayList<>();
        kthLevel2(root, 1, 3, list);
        System.out.println(list);
    
        // approach 3
        kthLevel3(root, 3);
    }

    static class Info {
        int level;
        Node node;

        public Info(int level, Node node)
        {
            this.level = level;
            this.node = node;
        }
    
        
    }

    // approach 1
    public static void kthLevel(Node root, int k)
    {
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(1,root));

        while(!q.isEmpty()) {
            Info curr = q.peek();
            q.poll();

           
            if(curr.level == k){
                System.out.print(curr.node.data +" ");
            }

            if(curr.node.left != null){
                q.add(new Info(curr.level+1, curr.node.left));
            }

            if (curr.node.right != null) {
                q.add(new Info(curr.level+1, curr.node.right));
            }
            
        }
        System.out.println();
    }

    // appraoch 2
    public static ArrayList<Integer> kthLevel2(Node root, int level, int k, ArrayList<Integer> list)
    {
        if(root == null)
        {
            return list;
        }

        if(level == k){
            list.add(root.data);
            return list;
        }

        // left subtree
        kthLevel2(root.left, level+1, k, list);

        // right subtree
        kthLevel2(root.right, level+1, k, list);

        return list;
    }


    // approach 3
    public static void kthLevel3(Node root, int k)
    {
        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        int level = 1;

        while(!q.isEmpty())
        {
            int n = q.size();

            for(int i=0; i<n; i++)
            {
                if(level == k){
                    System.out.print(q.peek().data +" ");
                }

                // left traverse
                if(q.peek().left != null)   q.offer(q.peek().left);

                // right traverse
                if(q.peek().right != null)  q.offer(q.peek().right);

                q.poll();
            }
            level++;
            if(level > k){
                break;
            }
        }
    }
}
