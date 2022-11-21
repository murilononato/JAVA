package Exercicios;


import java.util.Scanner;


public class Exercicios_I {
    public static void main(String[] args) {
    
        
    /* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
    mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
    (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/
     Scanner input = new Scanner (System.in);
    /*
   
    int ano=0, mes=0, dias=0, soma=0;
    int anoSoma=0, mesSoma=0;
    
        System.out.println("Digite quantos anos: ");
        ano = input.nextInt();
        
        System.out.println("Digite quantos meses: ");
        mes = input.nextInt();
        
        System.out.println("Digite quantos dias: ");
        dias = input.nextInt();
        
        anoSoma = ano * 365;
        mesSoma = mes * 30;
        
        soma = anoSoma + mesSoma + dias;
        
        System.out.println( ano + " anos, " + mes + " meses e " + dias + " dias = " + soma +" dias");
 */   
    
    /* Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
    calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
    (1SM=R$788,00)*/
    
    int salarioMinimo = 1100;
    
        System.out.println("Digite seu salario: ");
        double salario = input.nextDouble();
    
        double soma = salario / salarioMinimo;
        
        double resto = salario % salarioMinimo;
        
        if(salario < salarioMinimo){
            soma = salarioMinimo - salario;
            System.out.println("Seu salario não é suficiente para um salario minimo falta: "+soma + " reais");
        }else{
            
        System.out.println(salario + " = " + soma + " salarios minimos e " + resto);
             
        }
        
    }
}
