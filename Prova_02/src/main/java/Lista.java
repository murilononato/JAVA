//MURILO PARUSSOLO NONATO       RA:0040962023023	
public class Lista extends Pedidos {

    float comicao;
    
    public Lista() {
        this.setAtendido(false); // pedido ainda n atendido
    }
    
    public void buscarPedido(int numPed){
        if(numPed == this.getNumPedido()){
            System.out.println("O numero do pedido é: " + this.getNumPedido());
    }else{
            System.out.println("Pedido não encontrado");
        }
            
    }
    
    public void cadastrarPedido(int p){
        if(this.getNumPedido() == p){
            System.out.println("PEDIDO JA EXISTE");
        }
    }
    public void atenderPedido(int numPed){
        this.setAtendido(true); // atende o pedido
    }
    
    public void relatorioCliente(){
        System.out.println("Numero do pedido: " + this.getNumPedido());
        System.out.println("Numero do cliente: " + this.getCodigoCliente());
        System.out.println("Numero do vendedor: " + this.getCodigoVendedor());
        System.out.println("Valor: " + this.getValor());
        
        if(this.getAtendido()){
            System.out.println("PEDIDO ATENDIDO");
    }else{
            System.out.println("PEDIDO AINDA NÃO ATENDIDO");
        }
    }
    
    public void pagarVendedor(float p){
        
     comicao = this.getValor() * p;
        System.out.println("COMIÇÃO É DE: " +  comicao);
        
    }
}
