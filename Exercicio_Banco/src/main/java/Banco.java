public class Banco {
    public int conta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("-------------------------- ");
        System.out.println("Conta: " + this.getConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
     
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true); // this.status = true;
        
        
        if(t == "CC"){
            this.setSaldo(50);//this.saldo += 50;
        }else{
           this.setSaldo(150);//saldo += 150;
        }
        
    }
    
    public void fecharConta(){
        if(this.getSaldo()<0){
            System.out.println("VOCÊ NÃO PODE FECHAR A CONTA ESTA COM SALDO NEGATIVO");
        }else if(this.getSaldo()>0){
            System.out.println("VOCÊ NÃO PODE FECHAR A CONTA ESTA COM SALDO ");
        }else{
            this.setStatus(false);
            System.out.println("CONTA FECHADA COM SUCESSO!");
        }
    }
    
    public void depositar( double v){
        
        if(this.getStatus()){ //NO CASO SE FOR VERDADEIRO
          this.setSaldo(this.getSaldo()+v);
            System.out.println("SUCESSO NA CONTA: " + this.getDono()+ " FEITO SALDO: " + this.getSaldo());
        }else{
            System.out.println("IMPOSSIVEL FAZER O DEPOSITO POIS A CONTA ESTA FECHADA! ");
        }
        
       
    }
    
    public void sacar(double v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                 this.setSaldo(this.getSaldo() - v);
                 System.out.println("Saldo realizado na conta de: " + this.getDono());
            }else{
                System.out.println("SALDO INSUFISIENTE PARA SAQUE");
            }
        }else{
            System.out.println("SUA CONTA ESTA FECHADA");
        }
    }
    
    public void pagarMensalidade(){
        int v;
        if(this.getTipo() == "CC"){
            v = 12;
        }else{
            v = 20;
        }
        
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade PAGA");
        }else{
            System.out.println("Mensalidade não paga");
        }
    }
    
    public Banco(){ // status , saldo e tipo
        
        this.setStatus(false);//this.status = false;
        this.setSaldo(0);  //this.saldo = 0;
        
    }
    
    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
