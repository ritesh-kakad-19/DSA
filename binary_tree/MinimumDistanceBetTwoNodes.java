public class MinimumDistanceBetTwoNodes {
    
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

        findMinDistance(root, 4,7);
    }

    public static void  findMinDistance(Node root, int n1, int n2)
    {
        Node lca = lca(root, n1, n2);

        int dis1 = distance(lca, n1);
        int dis2 = distance(lca, n2);

        // System.out.println(lca.data);
        // System.out.println(dis1+" "+dis2);

        System.out.println(dis1 + dis2);

       
    }



    public static Node lca(Node root, int n1, int n2)
    {

        if(root == null || root.data == n1 || root.data == n2 ){
            return root;
        }

        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        if(leftLca == null)     return rightLca;
        if(rightLca == null)    return leftLca;

        return root;
    }

    public static int distance(Node root, int n ){
        
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int left = distance(root.left, n);
        int right = distance(root.right, n);

        if(left == -1 && right == -1){
            return -1;
        }

        if(left == -1)  return right+1;
        else     return left+1;

        
    }
}
