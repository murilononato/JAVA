public class Personagem{
    private String nome;
    private int xp;
    private String classe;

    public Personagem(String nome, String classe){
        this.nome = nome;
        this.classe = classe;
        this.xp = 5;
    }

    public String getNome(){
        return nome;
    }

    public void setNome( String nome){
        this.nome = nome;
    }

    public int getXP(){
        return xp;
    }

    public void setXp( int xp){
        this.xp = xp;
    }
    
    public String getClasse(){
        return classe;
    }

    public void setClasse( String classe){
        this.classe = classe;
    }
}