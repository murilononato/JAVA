public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void status(){
        System.out.println("O ALUNO: " + this.getNome() + " Esta cursando: " + this.getCurso());
        System.out.println("E possui a matricula: " + this.getMatricula());
    }
    public void cancelarMatr(){
        System.out.println("MATRICULA CANCELADAH");
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
