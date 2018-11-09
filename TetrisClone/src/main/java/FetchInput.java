import java.awt.Color;
import java.util.Random;

class FetchInput {
    private static int value[][] = new int[12][24];
    Random r = new Random();
    //converts all colors to 1, and black/gray to 0
    public static int[][] colorOuput(Color[][] well) {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 23; j++) {
                if (well[i][j].equals(Color.BLACK) || well[i][j].equals(Color.GRAY)) {
                    value[i][j] = 0;
                } else {
                    value[i][j] = 1;
                }
            }
        }

        return value;
    }
}
