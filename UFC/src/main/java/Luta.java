
import java.util.Random;


public class Luta {
    private Lutadores desafiado;
    private Lutadores desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutadores L1, Lutadores L2){
       if(L1.getCategoria().equals(L2.getCategoria()) && L1 != L2){
           this.aprovada = true;
           this.desafiado = L1;
           this.desafiante = L2;
       }else {
           this.aprovada = false;
           this.desafiado = null;
           this.desafiante = null;
       }     
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("##### DESAFIANTE #####");
            this.desafiante.apresentar();
            System.out.println("##### DESAFIADO #####");
            this.desafiado.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch(vencedor){
                case 0: // Empate
                    System.out.println("Empatou!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Vencedor desafiante   
                    System.out.println("Venceu!! Lutador: " + this.desafiante.getNome() );
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2: // Vencedor desafiado   
                    System.out.println("Venceu!! Lutador: " + this.desafiado.getNome());
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
            }       
            
        } else {
            System.out.println("NÃO PODE HAVER LUTA");
        }
    }

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
