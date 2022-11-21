public class peixe extends Animal{
     private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo alga");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Peixe");
    }
    
    public void soltarBolhas(){
        System.out.println("Soltando bolhas");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
