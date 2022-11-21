
package Exercicios;

import java.util.Scanner;

public class Exercicios_IV {
    public static void main(String[] args) {
        
        double conta;
        boolean validar = false;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite o 1º valor: ");
        double numeroI = input.nextInt();
        
        System.out.println("Digite o 1º valor: ");
        double numeroII = input.nextInt();
        
        while(validar == false){
        
        System.out.println("Digite qual operação deseja: ");
        System.out.println(" [+] ; [Somar] ");
        System.out.println(" [-] ; [Subtrair] ");
        System.out.println(" [*] ; [Multiplicar] ");
        System.out.println(" [/] ; [Dividir] ");
       
        String letra = input.next();
        
        System.out.println("---------------------------------");
        
        switch(letra){
            
            case "+":
            case "Somar":    
            case "somar":    
            case "SOMAR":
            conta = numeroI + numeroII;
            validar = true;
            System.out.println(" " + numeroI + " + " + " " + numeroII + " = " + conta); break;
            case "-":
            case "Subtrair":    
            case "subtrair":
            case "SUBTRAIR":    
            conta = numeroI - numeroII;
            validar = true;
            System.out.println(" " + numeroI + " - " + " " + numeroII + " = " + conta); break;
            case "*":
            case "Multiplicar":
            case "multiplicar":
            case "MULTIPLICAR":
            conta = numeroI * numeroII;
            validar = true;
            System.out.println(" " + numeroI + " * " + " " + numeroII + " = " + conta); break;    
            case "/":
            case "Dividir":
            case "dividir":
            case "DIVIDIR":
            conta = numeroI / numeroII;
            validar = true;
            System.out.println(" " + numeroI + " / " + " " + numeroII + " = " + conta); break;  
            default:
            System.out.println("Acho que você escreveu errado...");
            System.out.println("Vamos tentar denovo: Primeiro numero:" + numeroI + " Segundo numero: " + numeroII);
            validar = false;
        }
        
        }

    }
}
