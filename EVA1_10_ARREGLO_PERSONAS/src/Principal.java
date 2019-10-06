import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
       Persona[] aiPersona = new Persona[5];
       Scanner sCaptu = new Scanner(System.in);
        for (int i = 0; i < aiPersona.length; i++) {
          aiPersona[i]= new Persona();
            System.out.println("Introduce tu nombre: ");
          aiPersona[i].nombre = sCaptu.nextLine();
        } 
        imprimeArreglo(aiPersona);
        //COPIA DEL ARREGLO
        Persona[] aCopia = new Persona[aiPersona.length];
        for (int i = 0; i < aiPersona.length; i++) {
        aCopia[i]=new Persona();
        aCopia[i].nombre = aiPersona[i].nombre;
        
        }
        imprimeArreglo(aCopia);
        }
    public static void imprimeArreglo(Persona[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println("nombre: "+args[i].nombre);
        }
        
    }
    }
    class Persona{
        String nombre;
 

}

