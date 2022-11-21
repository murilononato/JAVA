public class televisao {
   public static void main(String[] args) {
   
       TV Tela = new TV();
       
       System.out.println("Sua TV é da marca: " + Tela.fabricante + " / E está: " 
        + (Tela.ligado == true ? "Ligada" : "Desligada") + "/ O volume está em: " + Tela.volume);
              
       Tela.ligar();
       Tela.aumentarVolume();
       Tela.aumentarVolume();
       Tela.aumentarVolume();
       System.out.println("Sua TV é da marca: " + Tela.fabricante + " / E está: " 
        + (Tela.ligado == true ? "Ligada" : "Desligada") + "/ O volume está em: " + Tela.volume);
       
   }
 
}
