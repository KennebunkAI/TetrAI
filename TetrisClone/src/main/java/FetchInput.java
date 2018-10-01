import java.awt.Color;

class FetchInput {
    private static Color[][] well;
    private static boolean value[][];

    FetchInput(Color[][] wells, boolean[][] values) {
        well = wells;
        value = values;
    }

        public static boolean[][] colorOuput() {
            well = new Color[12][24];
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 23; j++) {
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
