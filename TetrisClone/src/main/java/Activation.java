

public class Activation {
    public static double activate(double in) {
        // 1/1 + e^-x
        double out = (1 / (1 + Math.exp(-in)));
        return out;
    }
}
