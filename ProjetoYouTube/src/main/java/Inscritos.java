public class Inscritos extends Pessoa{
    private String login;
    private int totAssistido;

    public Inscritos(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        //na classe abstrata Pessoa tem o String todos os atributos da class e estou puxando ela
        return "Inscritos{" + super.toString() + "\n login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}

