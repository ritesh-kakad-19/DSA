import java.util.ArrayList;
import java.util.HashSet;

public class LowestAncestor {
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
    //                  1
    //                /   \
    //               2      3
    //             /  \    / \
    //            4    5  6   7
    //           / \  / \
    //          8  9 10 11

    public static void main(String args[])
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);

        commonAncestor(root, 5, 2);
        
        System.out.println(findCommonAncestor(root, 2, 8).data);;


    }


    // brute force approach
    public static void commonAncestor(Node root, int node1, int node2)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        findAncestor(root, node1, list1);
        findAncestor(root, node2, list2);

        System.out.println(list1 +"    "+ list2);

        for(int i=0; i<list1.size(); i++)
        {
            if(list2.contains(list1.get(i)))
            {
                System.out.println(list1.get(i));
                break;
            }
        }

    }

    public static ArrayList<Integer> findAncestor(Node root, int node, ArrayList<Integer> list)
    {
        if(root == null){
            return list;
        }

        if(root.data == node)
        {
            list.add(root.data);
            return list;
        }

        // left subtree
        findAncestor(root.left, node, list);

        if(!list.isEmpty())
        {
            list.add(root.data);
            return list;
        }

        // right subtree
        findAncestor(root.right, node, list);
         if(!list.isEmpty())
        {
            list.add(root.data);
            return list;
        }

        return list;

    }


    // approach 2
    public static Node findCommonAncestor(Node root,int p, int q)
    {
        if(root == null)
        {
            return null;
        }

        if(root.data == p || root.data == q)
        {
            return root;
        }

        Node leftLca = findCommonAncestor(root.left, p, q);
        Node rightLca = findCommonAncestor(root.right, p, q);

        if(leftLca == null){
            return rightLca;
        }

        if(rightLca == null){
            return leftLca;
        }

        return root;

        
    }
}
