public class Cachorro extends Lobo{
    
    @Override
    public void emitirSom() {
        System.out.println("AU AU AU!!!");
    }
    
    public void reagir(String frase){
       if("Olá".equals(frase) || "vms passear".equals(frase)){
           System.out.println("Abanar e Latir");
       }else{
           System.out.println("Rosnar");
       }
    }
    
    public void reagir(int hora, int min){
       if(hora< 12){
           System.out.println("Abanar");
       }else if(hora > 18){
           System.out.println("Latir");
       }else{
           System.out.println("Ignorar");
       }
    }
    
    public void reagir(boolean dono){
       if(dono){
           System.out.println("Abanar e Latir au au");
       }else{
           System.out.println("Rosnar e Estranhar Rsss");
       }
    }
    
    public void reagir(int idade, float peso){
        if (idade < 10) {
            if (peso<10) {
                System.out.println("Au Au Au");
            } else {
                System.out.println("Rssss");
            }
        } else {
              if (peso<10) {
                System.out.println("AUUUUU");
            } else {
                System.out.println("Hmmm");
            }
        }
    }
    
    public void reagir(float x, int y){
       //Mesmo o de cima tendo o mesmo valor e quantidade a posiçao é diferente
    }
    
    /*public int reagir(float x, int y){
       
         MESMO O RETORNO (INT) SENDO DIFERENTES NÃO PODE SER EXECUTADO
    
    }*/
    
    
}
