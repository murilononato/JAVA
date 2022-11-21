public final class Bolsista extends Aluno { // Essa Classe não pode ter filhos por conta do "final"
    private float bolsa;
    
    public void renovaBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
    @Override // ja possuimos o metodo PagarMensalidade por isso devemos reescrevelo
    public void PagarMensalidade(){
        System.out.println(this.nome + " é bolsista!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
