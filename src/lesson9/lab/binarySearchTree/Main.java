package lesson9.lab.binarySearchTree;

public class Main {

    public static void main(String [] args) {
        BinarySearchTree binarySearchTree = initializeBST();
        binarySearchTree.printTree();

        System.out.println("Count Node of BST: " + binarySearchTree.countNodeOfBST(binarySearchTree.getRoot()));
        System.out.println("Count Leaves of BST: " + binarySearchTree.countLeavesOfBST(binarySearchTree.getRoot()));
    }

    static BinarySearchTree initializeBST() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(25);
        binarySearchTree.insert(20);
        binarySearchTree.insert(30);
        binarySearchTree.insert(28);
        binarySearchTree.insert(29);
        binarySearchTree.insert(15);
        binarySearchTree.insert(18);
        binarySearchTree.insert(23);
        binarySearchTree.insert(10);
        binarySearchTree.insert(35);
        binarySearchTree.insert(45);
        binarySearchTree.insert(33);
        binarySearchTree.insert(29);
        return binarySearchTree;
    }
}
