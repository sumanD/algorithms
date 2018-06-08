package extra.gog.ds.tree.algo;


import extra.gog.ds.tree.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Give an algorithm for printing the level order data in reverse order. For example, the output for the below tree should be
 * 7 6 5 4 3 2 1
 *
 *
 *                  1
 *              2       3
 *            4  5    6    7
 */
public class ReverseLevelOrder {

    public static void levelOrderTraversalInReverse(Node root) {
        if(root == null) {
            return;
        }

        Stack<Node> nodeStack = new Stack<Node>();
        Queue<Node> nodeQueue = new LinkedList<Node>();

        nodeQueue.offer(root);

        while (!nodeQueue.isEmpty()) {
            Node tmp = nodeQueue.poll();

            if(tmp.getLeft() != null) {
                nodeQueue.offer(tmp.getLeft());
            }

            if(tmp.getRight() != null) {
                nodeQueue.offer(tmp.getRight());
            }

            nodeStack.push(tmp);
        }

        while (!nodeStack.isEmpty()) {
            System.out.print(nodeStack.pop().getKey() + " ");
        }
    }

    public static void main(String[] args) {


        Node root = new Node(1);
        root.setLeftNode(new Node(2));
        root.setRightNode(new Node(3));

        root.getLeft().setLeftNode(new Node(4));
        root.getLeft().setRightNode(new Node(5));

        root.getRight().setLeftNode(new Node(6));
        root.getRight().setRightNode(new Node(7));


        ReverseLevelOrder.levelOrderTraversalInReverse(root);

    }
}
