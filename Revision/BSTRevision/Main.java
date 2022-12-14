class Main {
    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();
        BST.insert(70);
        BST.insert(50);
        BST.insert(90);
        BST.insert(30);
        BST.insert(60);
        BST.insert(80);
        BST.insert(100);
        BST.insert(20);
        BST.insert(40);
        BST.preOrder(BST.root);
        System.out.println();
        BST.inOrder(BST.root);
        System.out.println();
        BST.postOrder(BST.root);
        System.out.println();
        BST.levelOrder();
    }
}