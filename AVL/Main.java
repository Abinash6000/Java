class Main {
    public static void main(String[] args) {
        AVL AVLTree = new AVL();
        BinaryNode node1 = new BinaryNode();
        AVLTree.root = node1;
        AVLTree.root.value = 1;
        BinaryNode node2 = new BinaryNode();
        AVLTree.root.right = node2;
        AVLTree.root.right.value = 2;
        BinaryNode node3 = new BinaryNode();
        AVLTree.root.left = node3;
        AVLTree.root.left.value = 3;
        AVLTree.levelOrder(AVLTree.root);
    }
}