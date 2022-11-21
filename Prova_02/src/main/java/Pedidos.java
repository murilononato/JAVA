//MURILO PARUSSOLO NONATO       RA:0040962023023
public class Pedidos {
    private int numPedido;
    private int codigoCliente;
    private  int codigoVendedor;
    private  float valor;
    private boolean atendido;
    private boolean pedidoPago;

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean getAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    public boolean getPedidoPago() {
        return pedidoPago;
    }

    public void setPedidoPago(boolean pedidoPago) {
        this.pedidoPago = pedidoPago;
    }

  
    
}
