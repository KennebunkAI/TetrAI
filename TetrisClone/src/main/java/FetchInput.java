import java.awt.Color;

class FetchInput {
    private static boolean value[][] = new boolean[12][24];

    FetchInput() {
    }
        public static boolean[][] colorOuput(Color[][] well) {
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 24; j++) {
                    if (well[i][j] == Color.BLACK) {
                        value[i][j] = false;
                    } else {
                        value[i][j] = true;
                    }
                }
            }
            return value;
        }
}
