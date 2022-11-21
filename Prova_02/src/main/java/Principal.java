//MURILO PARUSSOLO NONATO       RA:0040962023023
public class Principal {
    public static void main(String[] args) {
        Lista pedido1 = new Lista();
        
        
        //adicionando valores
        
        pedido1.setCodigoCliente(11111);
        pedido1.setCodigoVendedor(20000);
        pedido1.setNumPedido(1);
        pedido1.setValor(100.0f);
        
        
        System.out.println(""); // pulando linha
        pedido1.relatorioCliente();
        System.out.println(""); // pulando linha
        pedido1.atenderPedido(1);
        System.out.println(""); // pulando linha
        pedido1.relatorioCliente();
        System.out.println(""); // pulando linha
        pedido1.pagarVendedor(0.20f);
        System.out.println(""); // pulando linha
        pedido1.cadastrarPedido(1);
        System.out.println(""); // pulando linha
        pedido1.buscarPedido(1);

    }
}
