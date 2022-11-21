public class Prof extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void aumenarSalario (float aum){
       System.out.println("Salario aumentado");
        this.salario += aum;
        System.out.println("Salario Atual: " + this.salario);
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
