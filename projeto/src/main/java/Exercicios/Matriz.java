package Exercicios;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);            
        
       int [][] matriz = new int[3][3];

        
        for(int x = 0; x<3; ++x){
            for(int y = 0; y < 3; ++y){
                System.out.println("Digite um numero valor?");
                matriz[x][y] = input.nextInt();
                        
           }
        }
        System.out.println("");
        System.out.println("");
         for(int x = 0; x<3; ++x){
            for(int y = 0; y < 3; ++y){
                System.out.println("valor: " + matriz[x][y]);
                   
            }
        }
    }
}