public class Principal {

    public static void main(String[] args) {

        Principal pObj = new Principal();
        System.out.println(pObj);
        foo(pObj);
    }
    public static void foo(Principal param){
        System.out.println(param);
    }
}
