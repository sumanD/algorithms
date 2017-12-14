package gog.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public void inorderTraversal(Node node) {
        if(node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.key + " ");
        inorderTraversal(node.right);
    }

    public void preorderTraversal(Node node) {
        if(node == null) {
            return;
        }

        System.out.print(node.key + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public void postorderTraversal(Node node) {
        if(node == null) {
            return;
        }

        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.key + " ");
    }

    public void BreathFastSearch(Node node ){
        if(node == null ){
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();

        Node tempNode = node;

        while (tempNode != null ){
            System.out.print(node.key + " ");

            queue.add(node.left);
            queue.add(node.right);

            tempNode = queue.poll();
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        BinaryTree binaryTree = new BinaryTree(root);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);

        System.out.println("Inorder Traversal :-");
        binaryTree.inorderTraversal(binaryTree.root);

        System.out.println();
        System.out.println("Preorder Traversal :-");
        binaryTree.preorderTraversal(binaryTree.root);

        System.out.println();
        System.out.println("Postorder Traversal :-");
        binaryTree.postorderTraversal(binaryTree.root);

        System.out.println();
        System.out.println("Breath Fast Charge : - ");
        binaryTree.BreathFastSearch(binaryTree.root);
    }

}
