import java.util.LinkedList;
import java.util.Queue;

public class HeightOfTree {
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

    // build tree
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
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
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
         System.out.println("root of tree: "+ root.data);

        System.out.println("height of tree: "+ heightOfTree(root));
    }

    // level order traversal
    public static int heightOfTree(Node root) {

        if(root == null){
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int height = Math.max(leftHeight, rightHeight);

        return height+1;
    }
}
