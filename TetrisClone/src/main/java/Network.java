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

    Network(int nIn, int nOut, int hiddenLayers) {
        this.nIn = nIn;
        this.nOut = nOut;
        this.hiddenLayers = hiddenLayers;

        layers = new Layer[hiddenLayers];
        inputLayer = new Layer(nIn, nIn, nIn); //intput = input of network, output = input of next layer
        layers[0] = new Layer(nIn, nOut, 200);
        outputLayer = new Layer(layers[layers.length-1].getnOut(), nOut , nOut); //input = output of previous layer, output = output of network


        EstablishWeights(inputLayer);
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

    public void EstablishWeights(Layer lIn) {

        for(Node i: lIn.getNodes()) {
            int x = 0;
                i.weights[x] = new Weight(1, i);
        }
    }

    public double getOutput(int[][] values) {
        //converting 2d array to single array
        double[] input = new double[292];
        int count = 0;
        for(int x = 0 ; x < values.length; x ++) {
            for(int y = 0; y < values[0].length; y++) {
                input[count] = values[x][y];
            }
        }

        inputLayer.fetchLayerIn(input);
        layers[0].fetchLayerIn(inputLayer.calcOutput());
        outputLayer.fetchLayerIn(layers[0].calcOutput());

        double[] out = outputLayer.calcOutput();
        double output = 0;
        int outputIndex = 0;
        for(int v = 0; v < out.length; v++) {
            if(out[v] > output) {
                output = out[v];
                outputIndex = v;
            }
        }


        return outputIndex;
    }

}
