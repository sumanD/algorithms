package dataStructure.Graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Graph Node
 * Node has list of neighbour nodes
 */
public class GNode {
    private int data;
    private List<GNode> neighbourNodes = new ArrayList<>();
    private boolean isVisited = false;

    public GNode(int data) {
        this.data = data;
    }

    public void addNeighbour(GNode gNode) {
        neighbourNodes.add(gNode);
    }

    public List<GNode> getNeighbours() {
        return neighbourNodes;
    }

    public int getData() {
        return data;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
