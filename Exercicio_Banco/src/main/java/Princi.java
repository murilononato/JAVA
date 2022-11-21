public class Princi {
    public static void main(String[] args) {
        Banco p1 = new Banco(); 
        p1.setConta(1224);
        p1.setDono("Murillo");
        p1.abrirConta("CC");
        
        Banco p2 = new Banco(); 
        p2.setConta(3371);
        p2.setDono("Nonato");
        p2.abrirConta("CP");
      
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(1000);
        
        
        p1.fecharConta();
        p1.sacar(150);
        p1.fecharConta();
    }
}
