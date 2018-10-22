public class Summation {
    public static double sum(double[] values, Weight[] weights) {
        double total = 0;
        for(int x = 0; x < values.length; x++) {
            total += values[x] * weights[1].getNodeValue();
        }
        return total;
    }
}
