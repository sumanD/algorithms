package dataStructure.Graph;

import java.util.List;

/**
 * Utility class to operate on GNode
 */
public class GraphNodeUtil {
    public static void setAllNodesUnvisited(GNode node) {
        node.setVisited(false);
        List<GNode> neighbourNodes = node.getNeighbours();

        for (GNode gNode : neighbourNodes) {
            if (gNode != null) {
                setAllNodesUnvisited(gNode);
            }
        }
    }
}
