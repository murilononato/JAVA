 package Exercicios;
    
import java.util.Scanner;

public class Exercicios_III {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int [] num = new int [5];
        
        for(int i = 0; i<5; i++){
            System.out.println("Digite o " + (i+1) + "º número");
             num [i]= input.nextInt();
        }
        
        System.out.println("");
        
        for(int i = 5; i > 0; i--){
            
            System.out.println(num [i-1]);
        }
       
    }
}
