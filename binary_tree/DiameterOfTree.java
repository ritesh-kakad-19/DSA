

public class DiameterOfTree {
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
    //             / \   \
    //            4   5   6
    //                     \
    //                      7
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);

        System.out.println(diameterofTree(root));;

        System.out.println(diameter(root).dia);
    }

    // brute force approach: O(n^2)
    public static int diameterofTree(Node root)
    {
        if(root == null) return 0;

        // diameter pass through root
        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);
        
        int dia1 = leftHeight + rightHeight + 1;

        // diameter doesn't pass through root
        int leftDia = diameterofTree(root.left);
        int rightDia = diameterofTree(root.right);

        int dia2 = Math.max(leftDia, rightDia);

        return Math.max(dia1, dia2);

        
    }

    public static int treeHeight(Node root)
    {
        if(root == null){
            return 0;
        }

        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);

        return Math.max(leftHeight, rightHeight)+1;
    }


    // optimized approach: O(n)
    static class Info{
        int dia;
        int ht;

        public Info(int dia, int ht)
        {
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root)
    {
        if(root == null)
        {
            return new Info(0, 0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int finalDia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht + rightInfo.ht + 1);

        int finalht = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(finalDia, finalht);
    }
}
