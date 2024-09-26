//import java.util.Scanner;

import java.util.Arrays;

public class JavaSete{
    public static void main(String[] args) {
        
        final int tam = 10;
        int[] num = {6,5,8,9,1,4,2,8,3,1};
        int[] numeros = new int[tam];
        int p = 1;
        int pos;

        Arrays.sort(num);
        //Arrays.fill(numeros, 10);
        //System.arraycopy(num, 0, numeros, 0, tam);
        //System.out.printf("Arrays são iguais: %s", Arrays.equals(num, numeros) ? "Sim" : "Não ");

        pos = Arrays.binarySearch(num, p);
        System.out.printf("O elemento %d está no array? %s na posição %d" , p, pos > 0 ? "Sim" : "Não", pos);

        //for(int n:numeros){
        //    System.out.printf("%d - ",n);
        //};

    }
}