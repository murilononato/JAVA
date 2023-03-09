public class Mascote implements Batalha{
    private String nome;
    private String raca;
    private int levelAtual;
    private Personagem dono;

    public String status(){
        return "Mascote{" + "Nome:" + nome + ", raça: " + raca + ", Level: " + levelAtual + ", Dono: " + dono + '}';  
    }


    public Mascote(String nome, String raca, int levelAtual, Personagem dono){
        this.nome = nome;
        this.raca = raca;
        this.levelAtual = levelAtual;
        this.dono = dono;
    }

    public String getNome(){
        return nome;
    }

    public void setNome( String nome){
        this.nome = nome;
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca( String raca){
        this.raca = raca;
    }
    
    public int getLevelAtual(){
        return levelAtual;
    }

    public void setLevelAtual( int levelAtual){
        this.levelAtual = levelAtual;
    }

    public Personagem getDono(){
        return dono;
    }

    public void setDono( Personagem dono){
        this.dono = dono;
    }

    @Override
    public void lutar(){
    
    }

    @Override
    public void fugir(){
        
    }

    @Override
    public void usarItem(int aumentarXP){
        this.levelAtual += aumentarXP;
    }

    @Override
    public void trocarMascote(){
        
    }
}