package Exercicios;


import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double base, altura, areaRetangulo;
        
        System.out.println("Informe o valor da base: ");
        base = input.nextDouble();
        System.out.println("Informe o valor da altura: ");
        altura = input.nextDouble();
        
        areaRetangulo = base * altura;
        
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + areaRetangulo);
        
        
    }
    
    
}
