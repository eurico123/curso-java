public class Aranha extends AnimalTres{
    private int veneno;

    public Aranha(int vel, int massa, int forca, int veneno){
        super(vel, massa, forca);
        this.veneno = veneno;
    }

    @Override
    public void atacar(AnimalTres a){
        if(this.getVivo()){
            if(this.getForca() <= a.getForca()){
                this.setForca(this.getForca() + a.getMassa());  
            }
            if((this.getForca() + this.veneno) > a.getForca()){
                this.setForca(this.getForca() + a.getMassa());
                a.setVivo(false);  
            }else{
                this.setVivo(false);
            }
        }else{
            System.out.println("-------------------------------");
            System.out.println(this.getClass().toGenericString() + " está morto, não pode atacar!");
            System.out.println("-------------------------------");
        }
    }
}
