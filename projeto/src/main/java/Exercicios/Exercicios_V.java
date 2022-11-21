package Exercicios;

import java.util.Scanner;

public class Exercicios_V {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Qual sua idade? ");
        int idade = input.nextInt();
        
        boolean maior = (idade>17) ? true : false;
        
        System.out.println(maior);
    }
}
