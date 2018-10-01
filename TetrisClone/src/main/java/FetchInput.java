import java.awt.Color;

public class FetchInput {
    private Color[][] well;
    private boolean value[][];
    private int i, j;

   FetchInput(Color[][] well) {
       // Checks the 12x24 grid for all well colors. Black returns boolean value of false, everything else returns true

       this.well = well;
       value = new boolean[12][24];
   }
        public boolean[][] ColorOutput() {
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
