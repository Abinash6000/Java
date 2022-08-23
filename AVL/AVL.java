import java.util.Queue;
import java.util.LinkedList;

public class AVL {
    BinaryNode root;

    // Constructor
    AVL() {
        root = null;
    }

    // preOrder Traversal
    void preOrder(BinaryNode node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // inOrder Traversal
    void inOrder(BinaryNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // postOrder Traversal
    void postOrder(BinaryNode node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // levelOrder Traversal
    void levelOrder(BinaryNode node) {
        if (node == null)
            return;
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null)
                queue.add(presentNode.left);
            if (presentNode.right != null)
                queue.add(presentNode.right);
        }
    }

    // search Method
    BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value: " + value + " not found in AVL Tree");
            return null;
        } else if (node.value == value) {
            System.out.println("Value: " + value + " found in AVL Tree");
            return node;
        } else if (node.value > value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }
}
