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
        double Out = Summation.sum(input, weights);
        double Output = Activation.activate(Out);
        return Output;
    }

}