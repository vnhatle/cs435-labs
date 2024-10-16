package lesson9.lab.binarySearchTree;

public class BinarySearchTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public BinarySearchTree() {
        root = null;
    }

    public void printTree() {
        if (root == null) {
            System.out.println("Empty tree");
        } else {
            printTree(root);
        }
    }

    private void printTree(Node t) {
        if (t != null) {
            printTree(t.left);
            System.out.println(t.value);
            printTree(t.right);
        }
    }

    public void insert(Integer x) {
        if (root == null) {
            root = new Node(x, null, null);
            return;
        }

        Node n = root;
        boolean inserted = false;
        while(!inserted) {
            if (x.compareTo(n.value) <= 0) {
                if (n.left == null) {
                    n.left = new Node(x, null, null);
                    inserted = true;
                } else {
                    n = n.left;
                }
            } else if (x.compareTo(n.value) >= 0) {
                if (n.right == null) {
                    n.right = new Node(x, null, null);
                    inserted = true;
                } else {
                    n = n.right;
                }
            }
        }
    }

    public int countNodeOfBST(Node n) {
        if (n == null) {
            return 0;
        }

        return 1 + countNodeOfBST(n.left) + countNodeOfBST(n.right);
    }

    public int countLeavesOfBST(Node n) {
        if (n == null) {
            return 0;
        }

        if (n.left == null && n.right == null) {
            return 1;
        }

        return countLeavesOfBST(n.left) + countLeavesOfBST(n.right);
    }
}

class Node {
    Integer value;
    Node left;
    Node right;

    Node(Integer value) {
        this(value, null, null);
    }

    Node(Integer value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}