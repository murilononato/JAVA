public class Tecnico extends Aluno{
    private int RA;
    
    public void praticar(){
        System.out.println("O ALUNO ESTA EM SUA AULA PRATICA AGORA");
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }
      
}
