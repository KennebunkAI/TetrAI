public class Layer {
    //Layer Parameters
    private int nIn;
    private int nOut;
    private int numNodes;
    private Node[] nodes;
    private double[] input;
    private double[] output;

    Layer(int nIn, int nOut, int numNodes) {
        this.nIn = nIn;
        this.nOut = nOut;
        this.numNodes = numNodes;
        nodes = new Node[numNodes];
        output = new double[nOut];

        for(int x = 0; x <nodes.length; x++) {
            nodes[x] = new Node(nIn,nOut);
        }

    }

    public void calcOutput() {
        for(int x = 0; x < nodes.length; x++) {
            output[x] = nodes[x].calcOutput(input);
        }
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
