package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class PPT {
    public static void main(String[] args) {
        
             
        Scanner input = new Scanner (System.in);
        Random aleatorio = new Random();
        
        int pontoPC=0, pontoVC=0;
        
        String escolha;
              
        while(pontoPC < 5 && pontoVC < 5){
            

        
            int sorteio = aleatorio.nextInt(3);
                        
            System.out.println("");
            System.out.println("-------------------------------------------------");
            System.out.println("Escolha entre [1] PEDRA, [2] TESOURA OU [3] PAPEL");
            escolha = input.next();
            
            System.out.println("");
           
            switch(escolha){
               case "1" :
               case "PEDRA":
               case "Pedra":
               case "pedra":
                   if(sorteio == 0){
                       System.out.println("O COMPUTADOR JOGOU: PEDRA E VOCÊ JOGOU: PEDRA");
                       System.out.println("");
                       System.out.println("EMPATE");
                       System.out.println("PONTO SEU: " + pontoVC + "  ||  " + "PONTO DO COMPUTADOR: " + pontoPC);
                                          
                   }else if(sorteio == 1){
                       System.out.println("O COMPUTADOR JOGOU: TESOURA E VOCÊ JOGOU: PEDRA");
                       pontoVC++;
                        System.out.println("PONTO SEU: " + pontoVC + "  ||  " + "PONTO DO COMPUTADOR: " + pontoPC);
                       
                   }else{
                        System.out.println("O COMPUTADOR JOGOU: PAPEL E VOCÊ JOGOU: PEDRA");
                        pontoPC++;
                          System.out.println("PONTO SEU: " + pontoVC + "  ||  " + "PONTO DO COMPUTADOR: " + pontoPC);
                        
                   }break;
               case "2" :
               case "TESOURA":
               case "Tesoura":
               case "tesoura":    
                   if(sorteio == 0){
                       System.out.println("O COMPUTADOR JOGOU: PEDRA E VOCÊ JOGOU: TESOURA");
                       pontoPC++;
                       System.out.println("PONTO SEU: " + pontoVC + "  ||  " + "PONTO DO COMPUTADOR: " + pontoPC);
                       
                   }else if(sorteio == 1){
                       System.out.println("O COMPUTADOR JOGOU: TESOURA E VOCÊ JOGOU: TESOURA");
                       System.out.println("");
                       System.out.println("EMPATE");
                       System.out.println("PONTO SEU: " + pontoVC + "  ||  " + "PONTO DO COMPUTADOR: " + pontoPC);
                       
                   }else{
                        System.out.println("O COMPUTADOR JOGOU: PAPEL E VOCÊ JOGOU: TESOURA");
                        pontoVC++;
                        System.out.println("PONTO SEU: " + pontoVC + "  ||  " + "PONTO DO COMPUTADOR: " + pontoPC);
                   }break;
               case "3" :
               case "PAPEL":
               case "Papel":
               case "papel":    
                   if(sorteio == 0){
                      System.out.println("O COMPUTADOR JOGOU: PEDRA E VOCÊ JOGOU: PAPEL");
                      pontoVC++;
                      System.out.println("PONTO SEU: " + pontoVC + "  ||  " + "PONTO DO COMPUTADOR: " + pontoPC);
                    }else if(sorteio == 1){
                       System.out.println("O COMPUTADOR JOGOU: TESOURA E VOCÊ JOGOU: PAPEL");
                       pontoPC++;
                        System.out.println("PONTO SEU: " + pontoVC + "  ||  " + "PONTO DO COMPUTADOR: " + pontoPC);
                   }else{
                        System.out.println("O COMPUTADOR JOGOU: PAPEL E VOCÊ JOGOU: PAPEL");
                        System.out.println("");
                        System.out.println("EMPATE");
                        System.out.println("PONTO SEU: " + pontoVC + "  ||  " + "PONTO DO COMPUTADOR: " + pontoPC);

                   }break;
                    default:
                System.out.println("ERRO");
                                   
           } 
            
        }
        if(pontoVC > 4){
            System.out.println("");
            System.out.println("-------------------------");
            System.out.println("PARABENS VOCÊ VENCEU!!!! ");
       }else{
            System.out.println("");
            System.out.println("-------------------------");
            System.out.println("QUE TRISTE VOCÊ PERDEU :(");
        }   System.out.println("PONTO SEU: " + pontoVC + "  ||  " + "PONTO DO COMPUTADOR: " + pontoPC);
           
            
    }
}
