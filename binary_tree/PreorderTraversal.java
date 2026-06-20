public class PreorderTraversal {

    // define nodes
    static class Node{
        int data;
        Node left, right;

        Node(int data)
        {
            this.data = data;
            this.left  = null;
            this.right = null;
        }
    }

    // build tree
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
           

            return newNode;
        }
    }

    // main function
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        preorderTraversal(root);
    }

    // preorder traversal

    public static void preorderTraversal(Node currNode)
    {
        
        if(currNode == null){
            return;
        }
        else{
            System.out.print(currNode.data +" ");
        }

        // left subtree
        preorderTraversal(currNode.left);

        // right subtree
        preorderTraversal(currNode.right);

    }
}
