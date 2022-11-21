// Murilo Parussolo Nonato R.A: 0040962023023
import java.util.Scanner;

public class NewClass {
    
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
        System.out.println("Qual o endereço?");
        String endereco = input.next();
        
        System.out.println("Qual o CEP?");
        int cep = input.nextInt();
       
        System.out.println("Qual o nome do proprietario");
        String nome = input.next();
       
        System.out.println("Digite (1) para redidencial ou (2) comercial");
        int num = input.nextInt();
   
        if(num == 1){
           System.out.println("Qual a quantidade de quartos?");
             int quant = input.nextInt();
            
           System.out.println("Qual o numero de vagas na garagem?");
             int vagas = input.nextInt(); 
        
           System.out.println("Qual o preco minimo?");
            int preco = input.nextInt();
        
        }
        else if(num == 2){
        System.out.println("Qual o tipo do imovel?");
        String tipo = input.next();
        
        System.out.println("Qual a comprimento do imovel?");
        int comprimento = input.nextInt();
        
        System.out.println("Qual a largura do imovel?");
        int largura = input.nextInt();
        
        }else{
            System.out.println("Comando errado!");
        }
        
    }
}
