

public class Activation {
    public static double activate(double in) {
        double out = (1 / (1 + Math.pow(Math.E, -in)));
        return out;
    }
}
