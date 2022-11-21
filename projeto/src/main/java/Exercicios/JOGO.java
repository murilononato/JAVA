package Exercicios;

    import java.util.Random;
    import java.util.Scanner;


public class JOGO {
    
    public static void main(String[] args) {
   
        Scanner num = new Scanner (System.in);
        Random aleatorio = new Random();

        boolean acertou = false;
        int tentativas = 10;
        int sorteio = aleatorio.nextInt(100);
        long chute = 0;
        
       
        while(tentativas > 0 && acertou == false){
            
            System.out.println("Digite um numero:");
            chute = num.nextLong();
            
            if(sorteio == chute){        
            
            System.out.println("ACERTOU!!");
            acertou = true;
            
            }else if(chute > sorteio ){
                tentativas--;
                System.out.println("ERROU!! Numero esta muito GRANDE! " + tentativas + " tentativas restantes");   
            }else if(chute < sorteio){
                tentativas--;
                System.out.println("ERROU!! Numero esta muito PEQUENO! " + tentativas + " tentativas restantes");   
            }else{
                tentativas--;
                System.out.println("INVALIVO!! " + tentativas + "tentativas restantes");
            }
        
    }
            System.out.println("");
            System.out.println(sorteio);
    
    }
}