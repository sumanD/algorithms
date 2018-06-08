package extra.gog.flipkart;


import java.util.LinkedList;

/**
 *

 Sum of dependencies in a graph

 Given a directed and connected graph with n nodes. If there is an edge from u to v then u depends on v.
 Our task was to find out the sum of dependencies for every node.

 Example:
 For the graph in diagram,
 A depends on C and D i.e. 2
 B depends on D i.e. 1
 C depends on D i.e. 1
 And D depends on none.
 Hence answer -> 0 + 1 + 1 + 2 = 4

 http://www.geeksforgeeks.org/sum-dependencies-graph/

 Time Complexity :
 ================
 O(V) - V is the number of vertices in the graph. Since we need to loop through all the vertices to identify the edges

 Algorithm :
 ==========
 1. Construct a adjacency List
 2. Add elements into it. If node A has a directed edge to node B then add an entry in the List
 3. Capture all the edges by repeating step 2
 4. Loop through the Adjacency List and count the linked list size for the array element

 Note :
 In the adjacency list Nodes are represented as follow -

 A - 0
 B - 1
 C - 2
 D - 3 and so on.

 So for the above example, Adj List would look like this -

 [0] - 2->3
 [1] - 3
 [2] - 3
 [3] - []

 @author 30/10/2017 10:29 AM
 */
public class SumOfDependenciesInAGraph {

    // Adjacency List
    private LinkedList<Integer> adjacencyList [];

    public SumOfDependenciesInAGraph(Integer numberOfVertices) {
        this.adjacencyList = new LinkedList[numberOfVertices];

        for(int i=0;i<numberOfVertices;i++){
            LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
            adjacencyList[i] = integerLinkedList;
        }
    }

    /**
     * This method calculates the dependency sum by adding the dependency linked list sizes for
     * all the nodes present in the adjacency list
     *
     * @return int This returns sum of all the dependency
     */
    private int dependencySum() {
        int sum=0;

        for(int i=0;i<adjacencyList.length;i++){
            sum +=  adjacencyList[i].size();
        }
        return sum;
    }

    private void addEdge(int nodeP, int NodeC) {
        adjacencyList[nodeP].add(NodeC);
    }

    private void printAdjList(){
        for(int i=0;i<adjacencyList.length;i++) {
            System.out.println("Node = " + i + " has - " + adjacencyList[i]);
        }
    }

    public static void main(String[] args) {
        SumOfDependenciesInAGraph sum = new SumOfDependenciesInAGraph(4);
        sum.addEdge(0,2);
        sum.addEdge(0,3);
        sum.addEdge(1,3);
        sum.addEdge(2,3);

        // Print the Graph
        sum.printAdjList();

        // Calculate Sum
        int dependencySum = sum.dependencySum();
        System.out.println("SUM = " + dependencySum);
    }
}
