
import java.util.Scanner;

public class BC {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int num = input.nextInt();
        
        for(int i = 0; i<=10; i++){
            
            if(i == num){
                System.out.println("Seu numero é: " + i);
               // break; // Quebra do loop
            }else{
                System.out.println("Seu numero NÃO é: " + i);
                continue; // Tudo depois desda linha não sera executado e volta do inicio
            }
            
            System.out.println("Encontramos seu numero");
            break;
            
        }
        
        
        
        
    }
}
