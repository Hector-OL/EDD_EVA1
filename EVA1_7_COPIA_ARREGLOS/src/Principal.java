public class Principal {

    public static void main(String[] args) {
      int aiDatos[];
        int aiCopia[] ;
       //INICIALIZACION DEL ARREGLO
        aiDatos = new int [10];
        aiCopia= new int [10];
       //LENAR CON VALORES ALEATORIO
      for (int i = 0; i < aiDatos.length; i++){
      aiDatos[i]=(int)(Math.random() * 100 )+1;
      }
      System.out.println("ORIGINAL");
    
      for (int i = 0; i < aiDatos.length; i++){
          System.out.print("["+aiDatos[i]+"]");
      }
      System.out.println(aiDatos);
      System.out.println("COPIA");
    
      aiCopia = aiDatos;
        for (int i = 0; i < aiDatos.length; i++){
      System.out.print("["+aiCopia[i]+"]");
    }
    
    }
}
