public class Principal {

    public static void main(String[] args) {
     int aMatriz[][] = new int [3][5];
     //FOR ANIDADO
        for (int i = 0; i < aMatriz.length; i++) { //FILAS
            for (int j = 0; j < aMatriz[i].length; j++) {
                aMatriz[i][j] = (int) (Math.random() * 100);
            }
        }
        //IMPRIMIR LA MATRIZ: 
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                System.out.println("["+aMatriz[i][j]+"]");
            }
            System.out.println("");
        }
    
    }
    
}
