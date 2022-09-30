class Main {
    public static void main(String[] args) {
        AVL AVLTree = new AVL();
        AVLTree.insert(5);
        AVLTree.insert(10);
        AVLTree.insert(15);
        AVLTree.insert(20);
        AVLTree.levelOrder(AVLTree.root);
        AVLTree.delete(5);
        System.out.println();
        AVLTree.levelOrder(AVLTree.root);
        AVLTree.deleteAVL();
    }

}