package gog.ds.tree;

public class Node {
    int key;
    Node left;
    Node right;

    public Node(int key, Node left, Node right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    public Node(int key) {
        this.key = key;
    }

    public void setLeftNode(Node node) {
        this.left = node;
    }

    public void setRightNode(Node node) {
        this.right = node;
    }

    public int getKey() {
        return key;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
