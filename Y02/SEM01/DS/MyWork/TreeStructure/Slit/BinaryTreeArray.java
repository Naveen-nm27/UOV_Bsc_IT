public class BinaryTreeArray {
    int[] tree;
    int size;

    public BinaryTreeArray(int capacity) {
        tree = new int[capacity];
        size = capacity;
        for (int i = 0; i < capacity; i++) {
            tree[i] = -1;
        }
    }

    public boolean isValidIndex(int index) {
        return index >= 0 && index < size;
    }

    public void setRoot(int value) {
        tree[0] = value;
    }

    public void setLeftChild(int parent, int value) {
        int leftIndex = 2 * parent + 1;
        if (isValidIndex(leftIndex)) {
            tree[leftIndex] = value;
        } else {
            System.out.println("Left child index out of range");
        }
    }

    public void setRightChild(int parent, int value) {
        int rightIndex = 2 * parent + 2;
        if (isValidIndex(rightIndex)) {
            tree[rightIndex] = value;
        } else {
            System.out.println("Right child index out of range");
        }
    }

    public void inorder(int index) {
        if (!isValidIndex(index) || tree[index] == -1) return;
        inorder(2 * index + 1);
        System.out.print(tree[index] + " ");
        inorder(2 * index + 2);
    }

    public void preorder(int index) {
        if (!isValidIndex(index) || tree[index] == -1) return;
        System.out.print(tree[index] + " ");
        preorder(2 * index + 1);
        preorder(2 * index + 2);
    }

    public void postorder(int index) {
        if (!isValidIndex(index) || tree[index] == -1) return;
        postorder(2 * index + 1);
        postorder(2 * index + 2);
        System.out.print(tree[index] + " ");
    }

    public void maximum() {
        int max = Integer.MIN_VALUE;
        for (int value : tree) {
            if (value != -1 && value > max) {
                max = value;
            }
        }
        System.out.println("\nMaximum value in the tree: " + max);
    }

    public void minimum() {
        int min = Integer.MAX_VALUE;
        for (int value : tree) {
            if (value != -1 && value < min) {
                min = value;
            }
        }
        System.out.println("Minimum value in the tree: " + min);
    }

    public static void main(String[] args) {
        BinaryTreeArray tree = new BinaryTreeArray(20);

        tree.setRoot(280);
        tree.setLeftChild(0, 180);
        tree.setRightChild(0, 308);

        tree.setLeftChild(1, 156);
        tree.setRightChild(1, 255);

        tree.setLeftChild(2, 298);
        tree.setRightChild(2, 416);

        tree.setLeftChild(3, 12);
        tree.setRightChild(4, 275);
        tree.setLeftChild(5, 350);
        tree.setRightChild(6, 580);

        System.out.println("Inorder Traversal:");
        tree.inorder(0);
        System.out.println("\n");

        System.out.println("Preorder Traversal:");
        tree.preorder(0);
        System.out.println("\n");

        System.out.println("Postorder Traversal:");
        tree.postorder(0);
        System.out.println();

        tree.maximum();
        tree.minimum();
    }
}
