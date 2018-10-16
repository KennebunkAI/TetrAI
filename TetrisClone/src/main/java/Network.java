//This class houses the neural network

import java.util.Random;

public class Network {
    //hyperparameters
    private int nIn;
    private int nOut;
    private int hiddenLayers;
    private Layer inputLayer;
    private Layer[] layers;
    private Layer outputLayer;
    private int[] nodes;

    Network(int nIn, int nOut, int hiddenLayers, int[]nodes) {
        this.nIn = nIn;
        this.nOut = nOut;
        this.hiddenLayers = hiddenLayers;
        this.nodes = nodes;

        layers = new Layer[hiddenLayers];
        inputLayer = new Layer(nIn, layers[0].getnIn(), nIn); //intput = input of network, output = input of next layer
        outputLayer = new Layer(layers[layers.length-1].getnIn(), nOut , nOut); //input = output of previous layer, output = output of network

        EstablishWeights(inputLayer, layers[0]);
        EstablishWeights(layers[0], outputLayer);
    }

    public void EstablishWeights(Layer lIn, Layer lOut) {
        Random r = new Random();
        for(Node i: lIn.getNodes()) {
            int x = 0;
            for(Node c: lOut.getNodes()) {
                i.weights[x] = new Weight(r.nextDouble(),c);
                x++;
            }
        }
    }

    public double getOutput() {
        return 1; //placeholder
    }

}
