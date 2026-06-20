package binary_tree;

public class BuildBinaryTree {

    // node class
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

    // build binary tree
    static class BinaryTree{

        static int idx = -1;
        public static Node buildBinary(int nodes[])
        {
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildBinary(nodes);
            newNode.right = buildBinary(nodes);

            return newNode;
        }
    }

    public static void main(String[] args) {
        
        System.out.println("hello");
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildBinary(nodes);

        System.out.println(root.data);
    }
}
