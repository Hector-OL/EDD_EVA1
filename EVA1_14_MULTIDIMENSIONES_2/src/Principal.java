public class Principal {

    public static void main(String[] args) {
        int aiMatriz[][] = new int[2][3];
        int aiMatriz2[][];
        aiMatriz2 = new int[3][];
        aiMatriz2[0] = new int[10];
        aiMatriz2[1] = new int[100];
        aiMatriz2[2] = new int[1000];
        
        for (int i = 0; i < aiMatriz2.length; i++) {
            for (int j = 0; j < aiMatriz2[i].length; j++) {
                aiMatriz2[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        
        for (int i = 0; i < aiMatriz2.length; i++) {
            for (int j = 0; j < aiMatriz2[i].length; j++) {
                System.out.print("[" + aiMatriz2[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}