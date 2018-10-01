import java.awt.Color;

class FetchInput {
    private Color[][] well;
    private boolean value[][];
    private int i, j;

    public static FetchInput(Color[][] well, boolean value[][], int i, int j) {
        well = well;
        this.value = value;
        this.i = i;
        this.j = j;

        well = new Color[12][24];
        for(i = 0; i < 12; i++) {
            for (j = 0; j < 23; j++) {
                if (well[i][j] == Color.BLACK) {
                    value[i][j] = false;
                } else {
                   value[i][j] = true;
                }
            }
        }







    }




}
