public class SubtreeOfAnotherTree {
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

    //          main tree
    //                1
    //               / \
    //              2   3           
    //             / \   \
    //            4   5   6
    //                  
    
    //          subtree
    //              2           
    //             / \   
    //            4   5 
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
       

        Node root2 = new Node(2);
        root2.left = new Node(4);
        root2.right = new Node(5);
        //root2.right.left = new Node(6);

        System.out.println(root.data + " " + root2.data);
        System.out.println(isSubtree(root, root2));

    }

    public static boolean isSubtree(Node root, Node root2)
    {
        if(root == null){
            return false;
        }

        if(root.data == root2.data){
            if(isIdentical(root, root2)){
                return true;
            }
        }
        
        boolean leftAns = isSubtree(root.left, root2);
        boolean rightAns = isSubtree(root.right, root2);

        return leftAns || rightAns;

    }

    public static boolean isIdentical(Node root, Node root2){
        
        if(root == null && root2 == null){
            return true;
        }
         if(root == null || root2 == null || root.data != root2.data){
            return false;
        }
        
        if(isIdentical(root.left, root2.left) == false || isIdentical(root.right, root2.right) == false)
        {
            return false;
        }

        return true;

    }
}
