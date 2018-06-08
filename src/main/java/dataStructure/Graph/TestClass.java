package dataStructure.Graph;

/**
 * Test Class to execute and test Graph algorithms
 */
public class TestClass {

    public static void main(String[] args) {

        GNode node40 = new GNode(40);
        GNode node20 = new GNode(20);
        GNode node10 = new GNode(10);
        GNode node30 = new GNode(30);
        GNode node50 = new GNode(50);
        GNode node60 = new GNode(60);
        GNode node70 = new GNode(70);

        node40.addNeighbour(node10);
        node40.addNeighbour(node20);

        node20.addNeighbour(node10);
        node20.addNeighbour(node30);
        node20.addNeighbour(node50);
        node20.addNeighbour(node60);

        node10.addNeighbour(node30);

        node30.addNeighbour(node60);

        node60.addNeighbour(node70);
        node50.addNeighbour(node70);

        DFS dfs = new DFS();
        dfs.dfsRecursive(node40);
        System.out.println();
        GraphNodeUtil.setAllNodesUnvisited(node40);
        dfs.dfsIterative(node40);
    }
}
