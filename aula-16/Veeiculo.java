public class Veeiculo {
    protected String nome;
    protected int tipo;

    public Veeiculo(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public void info(){
        System.out.printf("Tipo: %d%n", this.tipo);
    }

    public String getNome(){
        return this.nome;
    }
}
