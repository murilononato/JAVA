public class Caneta {
    //atributos
    
    public String modelo;
    public String cor;
    private float ponta;
    protected  int carga;
    private boolean tampada;
    
    
    // this é o objeto que chamou no caso c1 ou c2 e ele modifica a variavel a sua frente
    
    //metodos
    public void status(){
        System.out.print("Essa caneta é da cor: " + this.cor);
        System.out.println(" Qual o modelo? " + this.modelo);
        System.out.println(" Está tampada? " + this.tampada);
    }
    
    public void rasbicar(){
        if(this.tampada == false){
            System.out.println("*RASBISCANDO O CADERNO*");
        }else{
            System.out.println("Não posso rabiscar :(");
        }
    }
    
    public  void tampar(){
        this.tampada = true;
      
    }
    
    public void destampar(){
        this.tampada = false;
        
    }
}
