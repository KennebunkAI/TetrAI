import java.awt.Color;

class FetchInput {
    private static int value[][] = new int[12][24];

    public static int[][] colorOuput(Color[][] well) {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 24; j++) {
                if (well[i][j] == Color.BLACK) {
                    value[i][j] = 0;
                } else {
                    value[i][j] = 1;
                }
            }
        }

        return value;
    }
}
