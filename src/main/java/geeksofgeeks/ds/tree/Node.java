package geeksofgeeks.ds.tree;

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
}
