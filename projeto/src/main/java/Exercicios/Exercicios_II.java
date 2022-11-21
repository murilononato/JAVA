package Exercicios;


  import java.util.Random; 
  import java.util.Scanner; 
  
public class Exercicios_II {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        Random num = new Random();
      
        int numeroI =  num.nextInt(10);
        int numeroII = num.nextInt(10);
        
        int resultado = numeroI * numeroII;
        
        System.out.println("Quanto é: " + numeroI + " * " + numeroII + " ?");
        int resposta = input.nextInt();
        boolean acerto = false;
        int vida = 4;
        
        while(vida > 0){
        
            if(resposta == resultado){
                System.out.println("PARABENS VOCÊ ACERTOU! :D");
                System.out.println("VIDAS RESTANTES: " + (vida+1));
                acerto = true;
                break;
        }else{
                System.out.println("Você errou :(");
                --vida;
                System.out.println("VIDAS RESTANTES: " +(vida+1));
                System.out.println("Tente novamente:");
                resposta = input.nextInt();
            }
        
        
        }
        
        if(acerto == true){
            System.out.println("VOCÊ GANHOU: " + 100 * (vida+1) + ",00 R$ Reais!");
        }else{
            System.out.println("INFELIZENTE VOCÊ NÂO GANHOU NADA A RESPOSTA CERTA ERA: " + resultado);
        }
    }
}
