

public class JavaNove {
    public static void main(String[] args) {

        msg("mamei", 1);

        System.out.println(soma2(6, 4));

        System.out.println(soma(6, 4, 7, 9));

        System.out.println(soma(2.5,2.5));
        
    }

    public static int soma(int... numeros){
        int res = 0;
        for(int n:numeros){
            res += n;
        }

        return res;
    }

    public static Double soma(Double... numeros){
        Double res = 0.0;
        for(Double n:numeros){
            res += n;
        }

        return res;
    }

    public static int soma2(int n1, int n2){

        int res = n1 + n2;

        return res;
    }

    public static void msg(String m, int l){
        for(int i = 0; i < l; i++){
            System.out.println(m);
        }
    }
}
