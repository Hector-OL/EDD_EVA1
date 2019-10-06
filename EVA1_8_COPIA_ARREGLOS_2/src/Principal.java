public class Principal {

    public static void main(String[] args) {
        int aiDatos[] = new int [10];
        int aiCopia[]= new int [10];
        for (int i=0; i < aiDatos.length; i++){
            aiDatos[i]=(int)(Math.random() * 100)+1;
            
        }
        //aiCopia = aiDatos, aqui copiamos direcciones
        //elemento por elemento
        for(int i = 0; i < aiDatos.length; i++){
            aiCopia[i]=aiDatos[i];
            }
        imprimirArreglo(aiDatos);
        imprimirArreglo(aiCopia);
        System.out.println(aiDatos);
        System.out.println(aiCopia);
        aiDatos[0]=99999;
        imprimirArreglo(aiDatos);
        imprimirArreglo(aiCopia);
        
    }
    public static void imprimirArreglo(int[] args){
        System.out.println("");
        for (int i = 0; i < args.length; i++){
            System.out.print("["+args[i]+"]");
        }
        System.out.println("");        
    }

}
