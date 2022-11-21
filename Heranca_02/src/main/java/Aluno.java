public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void PagarMensalidade(){
        System.out.println("Pagando Mensalidade do aluno: " + this.nome); 
        // o nome não esta em this.getNome pois o atributo da classe é protegido
        // (protected) q faz ser o atributo "publico" para sua classe e filhas 
    }
    
    public final void status(){ //Diferente do pagar mensalidade esse metodo n pode ser reescrito
        System.out.println("Alune: " + this.nome + " possui: " + this.idade + " anos.");
        System.out.println("Cursa: " + this.curso + " (" + this.matricula +  ") ." );
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
   
}
