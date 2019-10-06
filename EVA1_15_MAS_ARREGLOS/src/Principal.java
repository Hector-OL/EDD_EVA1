public class Principal {


    public static void main(String[] args) {
    int iNume=10;
        System.out.println("Valor = "+iNume);
        incrementa(iNume);
        System.out.println("Valor = "+iNume);
        //---
        System.out.println("");
        Prueba obje = new Prueba();
        obje.iVal = 10;
        System.out.println("Valor = "+obje.iVal );
        incrementaObj(obje);
        System.out.println("Valor = "+obje.iVal );
    }
    public static void incrementa(int iVal){
        iVal++;
     
    }
    public static void incrementaObj(Prueba obje){
        obje.iVal++;
    }}
class Prueba{
    int iVal;
}
