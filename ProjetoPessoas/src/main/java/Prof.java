public class Prof extends Pessoa {
    private String especialidade ;
    private float salario;
    
    public void aumento(float aum){
        this.salario += aum;
    }
    
    public void status(){
        System.out.println("E professore: " + this.getNome() + " da aula de: " + this.getEspecialidade());
        System.out.println("E ganha: " + this.salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
