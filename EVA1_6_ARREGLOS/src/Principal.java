public class Principal {

    public static void main(String[] args) {
        int aiDatos[],a ,b;
        int[] aiDatos2,x,y;
       //INICIALIZACION DEL ARREGLO
        aiDatos = new int [10];
       //LENAR CON VALORES ALEATORIO
      for (int i = 0; i < aiDatos.length; i++){
        aiDatos[i]=(int)(Math.random() * 100 )+1;
      }
    //SON OBJETOS
    //LA MEMORIA ES CONSECUTIVA
    //SON DE ACCESO ALEATORIO
    aiDatos[4]=5000;
   
    aiDatos[69]=500;
    System.out.println(aiDatos);
    //SON MUY RÁPIDOS
    //SON INMUTABLES (NO FLEXIBLES)
}
}
