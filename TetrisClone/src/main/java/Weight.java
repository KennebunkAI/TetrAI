public class Weight {

    private double nodeValue;
    private Node inputNode;

    Weight(double val, Node node) {
            nodeValue = val;
            inputNode = node;
        }

    public double getNodeValue() {
        return nodeValue;
    }
}

