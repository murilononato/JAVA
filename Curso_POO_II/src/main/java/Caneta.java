
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
        
    public Caneta( String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        //this.setPonta(p); PODERIA SER ASSIM POIS TEMOS O GET E O SET DESSE MODELO
        this.tampar();
    
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampada(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("MODELO: " + this.modelo);
        System.out.println("PONTA: " + this.ponta);
        System.out.println("COR: " + this.cor);
    }

}
