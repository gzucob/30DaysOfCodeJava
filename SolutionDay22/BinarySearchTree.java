package SolutionDay22;

public class BinarySearchTree {
    Node root;

    public int getHeight(Node root) {
        if (root == null) {
            return -1;
        } else {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            return 1 + Math.max(leftHeight, rightHeight);
        }
    }
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = insertRec(current.left, data);
        } else if (data > current.data) {
            current.right = insertRec(current.right, data);
        }
        return current;
    }
}
