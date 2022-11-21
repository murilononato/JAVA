
import java.util.Scanner;


public class Part_II {
    public static void main(String[] args) {
        
        Scanner escreve = new Scanner(System.in);
        String nome; // criando a variavel antes
        
        System.out.println("Qual seu primeiro nome ?");
        nome = escreve.next();
        
        System.out.println("Qual seu sobrenome ?");
        String sobre = escreve.next(); // criando a variavel dps
        
        System.out.println("Qual sua idade?");
        int idade = escreve.nextInt(); // Scanner com int
       
        System.out.println("Digite um ano:");
        int ano = escreve.nextInt();
        
        System.out.println("Oi, " + nome + " " + sobre + ", sua idade é: " + idade);
        
        // && e
        // || ou
        // != diferente
        
        //if((x <= 0) && (y != 1)){
        
        if(idade<1){
            System.out.println("Idade invalida");
        }else if (idade<18){
            System.out.println("Você é menor de idade");
        }else{
            System.out.println("Você é maior de idade");
        }
         
        boolean x = (ano % 400 == 0)||(ano % 4 == 0 && ano % 100 != 0); 
        
        /* Quando usamos == em comparacao ele retorna sempre FALSE ou TRUE
           Logo podemos utilizar isso como uma variavel boolean q caso
           verdadeiro ira retornar true
        */
         
        if((ano % 400 == 0)||(ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("Este ano é BISSEXTO");
        }else{
            System.out.println("Não é Bissexto");
        }
        System.out.println(x);
        
    }
}
