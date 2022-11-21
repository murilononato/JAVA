public class Lutadores {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String categoria;
    private int derrotas, empates, vitorias;
    
    public void apresentar(){
        System.out.println("Agora apresentamos: " + this.getNome());
        System.out.println("Diretamente de: " + this.getNacionalidade());
        System.out.println("Com " + this.idade + " anos");
        System.out.println("Medindo: " + this.getAltura() + " e Pesando: " + this.getPeso());
        System.out.println("Com: " + this.getVitorias() + " Vitorias");
        System.out.println("Com: " + this.getEmpates() + " Empates");
        System.out.println("Com: " + this.getDerrotas() + " Derrotas");
    }
    public void status(){
        System.out.println(this.getNome() + " : " + this.getCategoria());
        System.out.println("Ganhou:  " + this.getVitorias() + " Vezes");  
        System.out.println("Empatou: " + this.getEmpates() + " Vezes");
        System.out.println("Perdeu:  " + this.getDerrotas() + " Vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutadores(String nome, String na, int idade, float peso, float altura, 
            int derrotas, int empates, int vitorias) {
        this.nome = nome;
        this.nacionalidade = na;
        this.idade = idade;
        this.setPeso(peso);
        this.altura = altura;
        this.derrotas = derrotas;
        this.empates = empates;
        this.vitorias = vitorias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }

    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    
    
    
    
    
}
