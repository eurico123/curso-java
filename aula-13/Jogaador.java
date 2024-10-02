public class Jogaador {
    private final int maxVidas = 3;
    private int num = 0;
    private int vidas = 0;
    static boolean alerta = false;
    static int qtdJogadores = 0;
    static int pontoJogadores = 0;

    public Jogaador(int num){
        this.num = num;
        this.vidas = 1;
        System.out.printf("Jogador número %d criado%n", num);
        qtdJogadores++;
    };

    public int getVidas(){
        return this.vidas;
    };

    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    };

    static void pontos(){
        pontoJogadores+=10;
    };

    public void info(){
        System.out.printf("Jogador: %d%n", this.num);
        System.out.printf("Vidas: %d%n", this.vidas);
        System.out.printf("Alerta: %s%n", alerta ? "sim" : "não");
        System.out.printf("Quantidade de jogadores: %d%n", qtdJogadores);
        System.out.printf("Pontos dos jogadores: %d%n", pontoJogadores);
        System.out.printf("--------------------------------------%n");
    }

}
