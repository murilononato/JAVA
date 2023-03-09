public class banco{
    public static void main(String[] args) {
        contaBanco p1 = new contaBanco();
        p1.setNumConta(1111);
        p1.setDono("Murilo"); 
        p1.abrirConta("CC");
        p1.depositar(100);

        
        contaBanco p2 = new contaBanco();
        p2.setNumConta(2222);
        p2.setDono("Cleuza");
        p2.abrirConta("CP");
        p2.depositar(200);
        p2.sacar(350);
        p2.fecharConta();

        p1.estadoAtual();
        p1.espaco();
        p2.estadoAtual();
    }
}