//This class houses the neural network
import java.util.Arrays;
import java.util.Random;
public class Network {
    //hyperparameters
    private int numHNodes = 10;
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
        inputLayer = new Layer(nIn, numHNodes, nIn); //intput = input of network, output = input of next layer
        layers[0] = new Layer(nIn, nOut, numHNodes);
        outputLayer = new Layer(numHNodes, nOut , nOut); //input = output of previous layer, output = output of network


        EstablishWeights(layers, inputLayer, outputLayer);

    }

    public void EstablishWeights(Layer[] hiddenLs, Layer InputL, Layer OutputL) {
        Random r = new Random();
        for(int x = 0; x < inputLayer.nodes.length; x++) {
            for(int y = 0; y < inputLayer.nodes[x].weights.length; y++) {
                inputLayer.nodes[x].weights[y] = new Weight(1/inputLayer.nodes.length);
            }
        }

        for(int z = 0; z < hiddenLs.length; z++) {
            for(int t = 0; t < hiddenLs[z].nodes.length; t++) {
                for(int j = 0; j <hiddenLs[z].nodes[t].weights.length; j++) {
                    hiddenLs[z].nodes[t].weights[j] = new Weight(r.nextDouble()/hiddenLs[z].nodes.length);
                }
            }
        }

        for(int g = 0; g < outputLayer.nodes.length; g++) {
            for(int h = 0; h <  outputLayer.nodes[g].weights.length; h++) {
                outputLayer.nodes[g].weights[h] = new Weight(r.nextDouble()/outputLayer.nodes.length);
            }
        }
    }

    public void EstablishWeights(Layer lIn) {

        for(Node i: lIn.getNodes()) {
            int x = 0;
                i.weights[x] = new Weight(1);
        }
    }

    public double getOutput(int[][] values) {
        //converting 2d array to single array
        double[] input = new double[288];
        int count = 0;
        for(int x = 0 ; x < values.length; x ++) {
            for(int y = 0; y < values[x].length; y++) {
                input[count] = values[x][y];
                count++;
            }
        }

        inputLayer.fetchLayerIn(input);
        //System.out.println(Arrays.toString(input));
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

        System.out.println(Arrays.toString(out));
        return outputIndex;
    }

}
