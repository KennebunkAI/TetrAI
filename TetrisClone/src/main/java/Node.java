public class Node {
    private int nIn;
    private int nOut;
    public Weight[] weights;

    Node(int nIn, int nOut) {
        this.nIn = nIn;
        this.nOut = nOut;
        weights = new Weight[nIn];
    }

    public double calcOutput(double[] input) {
        return .01;
    }


}

