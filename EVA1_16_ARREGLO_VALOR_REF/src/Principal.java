public class Principal {

    public static void main(String[] args) {
        int arreglo[] = new int[11]; 
        System.out.println(arreglo);
        llenarArreglo(arreglo);
        madrearArreglo(arreglo);
        System.out.println(arreglo);
        imprimirArreglo(arreglo);
        
    }
public static void llenarArreglo(int[] fierro){
    for (int i = 0; i < fierro.length; i++) {
        fierro[i]= (int)(Math.random()*100);
    }
    
}
public static void imprimirArreglo(int[] fierro){
    for (int i = 0; i < fierro.length; i++) {
        System.out.print("["+fierro[i]+"]");
    }
    System.out.println("");
}
public static void madrearArreglo(int[] fierro){
    fierro = new int[100];
    System.out.println(fierro);
    }
}

