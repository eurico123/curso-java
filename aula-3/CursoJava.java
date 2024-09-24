public class CursoJava {
    public static void main(String[] args){
        
        int pos = 7;

        switch (pos) {
            case 1:
                System.out.println("primeiro lugar");
                break;
            case 2:
                System.out.println("segundo lugar");
                break;
            case 3:
                System.out.println("terceiro lugar");
                break;
            case 4: case 5: case 6: 
                System.out.println("prêmio de participação");
                break;
            default:
                System.out.println("não ganhou porra nenhuma!");
                break;
        };


        // tabela verdade AND: &&
        /* 
            V V = V
            V F = F
            F V = F
            F F = F
        */
        // tabela verdade OR: ||
        /* 
            V V = V
            V F = V
            F V = V
            F F = F
        */

        /* 
            res=(nota >= media ? 1 : 0);
            System.out.println("Resultado: "+ (res==1?"aprovado":"reprovado"));
        */

        /*
            if(nota>=media && faltas<=maxfaltas){
                System.out.println("aprovado!");
            }else if(nota>= 40){
                System.out.println("recuperação!");
            }else{
                System.out.println("reprovado!");
            };

            System.out.println("fim do código");
        */
    }
}
