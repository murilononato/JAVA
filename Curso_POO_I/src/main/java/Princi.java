public class Princi { // Principal (Main)
    
    public static void main(String[] args) {
   
        Caneta c1 = new Caneta(); // Instanciando o objeto
        Caneta c2 = new Caneta(); // "Criando o objeto"
        
        c1.carga = 60;
        c1.cor = "Preta";
        c1.modelo = "BIC";
        // c1.ponta = 0.3f;
        // c1.tampada = false; como "tampada" é privado eu só posso mexer dentro da classe Caneta
        
        c1.status();
        
        c2.carga = 10;
        c2.cor = "Vermelha";
        c2.modelo = "BIC";
        // c2.ponta = 0.3f;
        // c2.tampada = true;
        
        c2.status();
        

        // por ser privado n posso mexer no atributo "tampada" logo n posso modificado 
        
        c2.rasbicar();
        c2.tampar(); // a não ser q esteja dentro da classe Caneta e é isso q (tampar) faz
        // modifica o conteudo de tampar dentro da classe caneta...
        // ja que (tampar) ou (destampar) é publico
        c2.rasbicar();
        
}
    
}
