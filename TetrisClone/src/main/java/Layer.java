public class Layer {
    //Layer Parameters
    private int nIn;
    private int nOut;
    private int numNodes;
    private Node[] nodes;

    Layer(int nIn, int nOut, int numNodes) {
        this.nIn = nIn;
        this.nOut = nOut;
        this.numNodes = numNodes;
        nodes = new Node[numNodes];
        for(int x = 0; x < numNodes; x++) {
            //nodes[x] = new Node();
        }
    }

    public Node[] getNodes() {
        return nodes;
    }

    public int getnIn() {
        return nIn;
    }

    public int getnOut() {
        return nOut;
    }
}
