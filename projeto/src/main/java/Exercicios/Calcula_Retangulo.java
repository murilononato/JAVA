package Exercicios;

import java.util.Scanner;

public class Calcula_Retangulo {
    // Faça um programa que o metodo para calcular a área de dois retangulo e somar as bases;
    public static void main(String[] args) {
        
         Scanner escreve = new Scanner(System.in);
         
         double[] base = new double[2] ;
         
         double[] altura = new double[2] ;
         
         for(int x = 0; x<2; x++){
             System.out.println("Digite a base do " + (x+1) + "º retangulo");
             base[x] = escreve.nextDouble();
             System.out.println("Digite a altura do " + (x+1) + "º retangulo");
             altura[x] = escreve.nextDouble();
             
         }
         
         double soma = calcular(base,altura);
         System.out.println("O resultado das areas são: " + soma);
         
    }
   
    public static double calcular(double base[], double altura[]) {
         double som = 0;
        
         for(int x = 0; x<2; x++){
            som = som +  base[x] * altura[x];
             System.out.println("A area do " + (x+1)+"º retangulo é: " + (base[x] * altura[x]));
         }
        
         return som;
         
    }
}
