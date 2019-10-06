public class Principal {

    public static void main(String[] args) {
        int aMatriz[][][][][] = new int [5][3][8][10][11];
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                for (int k = 0; k < aMatriz[i][j].length; k++) {
                    for (int l = 0; l < aMatriz[i][j][k].length; l++) {
                        for (int m = 0; m < aMatriz[i][j][k][l].length; m++) {
                            aMatriz[i][j][k][l][m] = (int)(Math.random() * 1000);
                            
                            System.out.println("["+aMatriz[i][j][k][l][m]+"]");
                        }
                    }
                }
            }
                    
        }
    }
    
}
