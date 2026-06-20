import java.util.ArrayList;

public class KthAncestor {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
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
    public static void main(String[] args) {
        
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

        kthAncestor(root, 10, 3);
        kthAncestor2(root, 10, 3);
    }


    // approach 1
    public static void kthAncestor(Node root, int node, int k){
        ArrayList<Integer> list = new ArrayList<>();
        ancestors(root, node, list);
        System.out.println(list);
        System.out.println("Kth parent(ancestor): "+ list.get(k));
    }

    public static ArrayList<Integer> ancestors(Node root, int n, ArrayList<Integer> list){

        if(root == null){
            return list;
        }

        if(root.data == n){
            list.add(root.data);
            return list;
        }

        ancestors(root.left, n, list);
        if(list.isEmpty()){
            ancestors(root.right, n, list);
        }

        if(!list.isEmpty()){
            list.add(root.data);
        }
        return list;
    }

    // approach 2
    public static int kthAncestor2(Node root, int n, int k){
        if(root == null){
            return -1;
        }

        if(root.data ==  n){
            return 1;
        }

        int leftK = kthAncestor2(root.left, n, k);
        if(leftK == k){
            System.out.println("Kth ancestor: "+root.data);
            return leftK+1;
        }
        if(leftK != -1 && leftK < k){
            return leftK+1;
        }
        

        int rightK = kthAncestor2(root.right, n, k);
        if(rightK == k){
            System.out.println("Kth ancestor: "+root.data);
            return rightK+1;
        }
        if(rightK != -1 && rightK < k){
            return rightK+1;
        }
        
        return -1;
        
    }
}
