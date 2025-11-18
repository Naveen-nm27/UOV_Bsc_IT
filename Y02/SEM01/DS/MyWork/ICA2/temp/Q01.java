import java.util.*;

class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // (i) Create a binary tree from list of values level-by-level
    public void createTreeLevelOrder(int[] values) {
        if (values.length == 0) return;

        root = new Node(values[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (i < values.length) {
            Node current = queue.poll();

            // Left child
            if (i < values.length) {
                current.left = new Node(values[i++]);
                queue.add(current.left);
            }

            // Right child
            if (i < values.length) {
                current.right = new Node(values[i++]);
                queue.add(current.right);
            }
        }
    }

    // (ii) Count number of leaf nodes
    public int countLeafNodes(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    // (iii) Count number of internal nodes
    public int countInternalNodes(Node node) {
        if (node == null || (node.left == null && node.right == null)) return 0;
        return 1 + countInternalNodes(node.left) + countInternalNodes(node.right);
    }

    // (iv) Traversals
    public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }

    public void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.value + " ");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        int[] values = {280, 180, 308, 156, 255, 298, 416, 12, 275, 350, 580};
        tree.createTreeLevelOrder(values);

        System.out.print("Preorder: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Inorder: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Postorder: ");
        tree.postorder(tree.root);
        System.out.println();

        System.out.println("Number of leaf nodes: " + tree.countLeafNodes(tree.root));
        System.out.println("Number of internal nodes: " + tree.countInternalNodes(tree.root));
    }
}
