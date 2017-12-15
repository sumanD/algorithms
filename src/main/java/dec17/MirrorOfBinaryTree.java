package dec17;

/**
 * Mirror of a Tree: Mirror of a Binary Tree T is another Binary Tree M(T)
 * with left and right children of all non-leaf nodes interchanged.
 */
public class MirrorOfBinaryTree {

    static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
        }

        public Node() {
        }
    }

    static class BinaryTree {
        Node root = new Node();

        public Node mirror(Node node) {

            if(node != null) {
                Node left = mirror(node.left);
                Node right = mirror(node.right);

                node.left = right;
                node.right = left;
            }
            return node;
        }

        public void traverse(Node node) {
            if(node != null ) {
                System.out.println(node.data + " ");
                traverse(node.left);
                traverse(node.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        // Root
        binaryTree.root.data = 1;
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);

        // Left
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);

        System.out.println("Before = " );
        binaryTree.traverse(binaryTree.root);

        Node mirror = binaryTree.mirror(binaryTree.root);
        System.out.println("After = " );
        binaryTree.traverse(mirror);

    }
}
