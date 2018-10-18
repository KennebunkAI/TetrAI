public class Layer {
    //Layer Parameters
    private int nIn;
    private int nOut;
    private int numNodes;
    private Node[] nodes;
    private double[] input;
    double[] output;

    Layer(int nIn, int nOut, int numNodes) {
        this.nIn = nIn;
        this.nOut = nOut;
        this.numNodes = numNodes;
        nodes = new Node[numNodes];
        output = new double[numNodes];

        for(int x = 0; x <nodes.length; x++) {
            nodes[x] = new Node(nIn,nOut);
        }

    }

    public double[] calcOutput() {
        for(int x = 0; x < nodes.length; x++) {
            output[x] = nodes[x].calcOutput(input);
        }
        return output;
    }

    public void fetchLayerIn(double[] values) {
        this.input = values;
    }

    public double[] getOutput() {
        return output;
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
