package extra;



public class FinalClass {

    class Node {
        public int data;

        public Node(int data) {
            this.data = data;
        }
    }

    // Collection - Array of Custom Objects
    public void iterateAnArray() {
        Node[] nodes = new Node[5];
        nodes[0] = new Node(1);
        nodes[1] = new Node(2);
        nodes[2] = new Node(3);
        nodes[3] = new Node(4);

        for(Node node : nodes) {
            if(node == null) {
                System.out.println("NULL NODE = " + node);
            }
            else {
                System.out.println(node.data);
            }
        }
    }

    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.iterateAnArray();
    }


}
