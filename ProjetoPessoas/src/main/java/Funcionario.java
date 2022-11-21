public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    public void mudaTrabalho(){
        this.trabalhando = ! this.trabalhando; 
        // ! diferente ou seja se estiver true passa pra false e de false pra true
        
    }

    public void status(){
        System.out.println("O funcionario: " + this.trabalhando + " no setor: " + this.setor);
    }
    
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
