public class Layer {
    //Layer Parameters
    private int nIn;
    private int nOut;
    private int nodes;

    Layer(int nIn, int nOut, int nodes) {
        this.nIn = nIn;
        this.nOut = nOut;
        this.nodes = nodes;
    }

    public int getnIn() {
        return nIn;
    }
}
