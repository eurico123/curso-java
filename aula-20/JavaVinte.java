public class JavaVinte {
    public static void main(String[] args) {

        Sapo a1 = new Sapo(10,10,10);
        Aranha a2 = new Aranha(5,5,5,3);
        FormigaDois a3 = new FormigaDois(2,2,2);
        Vegetal v1 = new Vegetal(1);
        Vegetal v2 = new Vegetal(5);
        Vegetal v3 = new Vegetal(10);

        a2.atacar(a3);
        System.out.println(a3.getVivo());
    }
}
