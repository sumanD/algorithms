package dataStructure.Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * DFS traversal algorithm implementation
 */
public class DFS {

    /**
     * Depth first search recursively
     * @param gNode
     */
    public void dfsRecursive(GNode gNode) {
        // Check if the Node is null

        if(gNode == null) {
            return;
        }

        // Visit this node
        System.out.print(gNode.getData() + " ");
        gNode.setVisited(true);

        // Fetch its neighbour nodes
        List<GNode> neighbours = gNode.getNeighbours();

        // Visit each neighbour node

        for(GNode node : neighbours) {
            if(node != null && !node.isVisited()) {
                dfsRecursive(node);
            }
        }
    }

    public void dfsIterative(GNode gNode) {
        if(gNode == null) {
            return;
        }

        gNode.setVisited(true);

        Queue<GNode> queue = new LinkedList<>();
        queue.add(gNode);

        while (!queue.isEmpty()) {
            GNode node = queue.remove();
            System.out.print(node.getData()+ " ");
            List<GNode> neighbourNodes = node.getNeighbours();
            for(GNode node1 : neighbourNodes) {
                if(node1.isVisited() == false) {
                    node1.setVisited(true);
                    ((LinkedList<GNode>) queue).add(node1);
                }
            }
        }
    }
}
