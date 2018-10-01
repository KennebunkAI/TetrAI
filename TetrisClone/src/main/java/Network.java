//This class houses the neural network

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
        inputLayer = new Layer(nIn, layers[0].getnIn(), nIn); //intput = input of network, output = input of next layer
        outputLayer = new Layer(layers[layers.length-1].getnOut(), nOut , nOut); //input = output of previous layer, output = output of network
    }

    public double getOutput() {
        return 1; //placeholder
    }

}
