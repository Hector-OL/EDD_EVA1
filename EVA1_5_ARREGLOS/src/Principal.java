public class Principal {

    public static void main(String[] args) {
       //DECLARACION DE ARREGLOS
       int aiDatos[] = new int [10];
       //N --> # DE ELEMENTOS
       //0 --> 1ER ELEMENTO
       //N-1 --> ÚLTIMO ELEMENTO
       System.out.println(aiDatos);
       for(int i = 0; i < aiDatos.length; i++){
           aiDatos[i] = (int)(Math.random() * 100) + 1;
       }
        System.out.println("FOR NORMAL");
       for(int i = 0; i < aiDatos.length; i++){
           System.out.println(aiDatos[i]);
       }
       //FOR-EACH
        System.out.println("FOR EACH");
        for (int x : aiDatos) {
            System.out.println(x);
        }
    }
    
}
