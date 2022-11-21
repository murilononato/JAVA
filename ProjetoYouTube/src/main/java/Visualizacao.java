public class Visualizacao {
    private Inscritos espectador;
    private Video filme;

    public Visualizacao(Inscritos espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        if(nota > 5){
            this.filme.setAvaliacao(5);
        }else{
            this.filme.setAvaliacao(nota);
        }
    }
    
     public void avaliar(float porc){
        if(porc <= 20){
            this.filme.setAvaliacao(1);
        }else if (porc <=40){
            this.filme.setAvaliacao(2);
        }else if (porc <=60){
            this.filme.setAvaliacao(3);
        }else if (porc <=80){
            this.filme.setAvaliacao(4);
        }else{
            this.filme.setAvaliacao(5);
        }
    }
    
    
    
    public Inscritos getEspectador() {
        return espectador;
    }

    public void setEspectador(Inscritos espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
