import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNode root;

    BinarySearchTree() {
        this.root = null;
    }

    // Insert Method
    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            // System.out.println("Node Successfully Inserted!");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }

    void insert(int value) {
        this.root = insert(root, value);
    }

    // PreOrder Traversal

    void preOrder(BinaryNode node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // InOrder Traversal

    void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // PostOrder Traversal

    void postOrder(BinaryNode node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // LevelOrder Traversal

    void levelOrder() {
        Queue<BinaryNode> q = new LinkedList<>();
        q.add(this.root);
        while (!q.isEmpty()) {
            BinaryNode currNode = q.remove();
            System.out.print(currNode.value + " ");
            if (currNode.left != null)
                q.add(currNode.left);
            if (currNode.right != null)
                q.add(currNode.right);
        }
    }

    // Minimum node
    public static BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null)
            return root;
        else
            return minimumNode(root.left);
    }

    // Delete node
    public BinaryNode deleteNode(BinaryNode root, int value) {
        if (root == null) {
            System.out.println("Value not found in BST");
            return null;
        }
        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            // 3 cases. 1. if the currentNode is leaf node. 2. if the currentNode has one
            // child. 3. if the currentNode has two children.
            if (root.left != null && root.right != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                root.value = minNodeForRight.value;
                root.right = deleteNode(root.right, minNodeForRight.value);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }
        return root;
    }
}
