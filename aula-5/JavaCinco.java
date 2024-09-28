
public class JavaCinco {
    public static void main(String[] args) {
        
        // FOR
        /* 
        for(int cont=5; cont > 0; cont--){
            System.out.println(cont + " - CBF cursos");
        };
        */
        
        // WHILE
        /* 
        Scanner leitor = new Scanner(System.in);
        int max=leitor.nextInt();

        int cont=0;
        while(cont < max){
            System.out.println(cont + " - CBF cursos");
            cont++;
        };
        */

        // DO WHILE

        int cont=0;
        do{
            System.out.println(cont + " - CBF cursos");
            cont++;

        }while(cont < 0);

        System.out.println("fim do programa");
    }
}
