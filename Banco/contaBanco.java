public class contaBanco{
   
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public void espaco(){
        System.out.println("");
    }

    //Metodos personalizados
    public void estadoAtual(){
        System.out.println("Conta: " + getNumConta());
        System.out.println("Dono: " + getDono());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if(t == "CC"){
            this.setSaldo(50);
        }else if(t == "CP"){
            this.setSaldo(150);
        }

        System.out.println("conta aberta");
    }

    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("conta não pode ser feichada pois ha dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta não pode ser pois tem saldo negativo");
        }else{
            this.setStatus(false);
            System.out.println("conta fechada");
        }
    }
    
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("deposito realizado " + getDono());
        }else{
            System.out.println("Impossivel realizar a conta esta fechada");
        }
    }

    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("valor aplicado");
            }else{
                System.out.println("saldo insuficiente");
            }
        }else{
            System.out.println("A conta esta fechada");
        }
    }
    
    public void pagarMensalidade(){
        int v;
        if(this.getTipo() == "CC"){
            v = 12;
        } else {
            v = 20;
        }
        
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade pagada");
        }
    
    }



    public contaBanco(){
     this.saldo = 0;
     this.status = false;   
    }

    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
  
    public boolean getStatus(){
        return status;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }
}