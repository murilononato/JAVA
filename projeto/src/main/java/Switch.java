
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
   
        Scanner input = new Scanner (System.in);
        
        int x;
        
        System.out.println("Selecione um número:");
        x = input.nextInt();
        
        switch(x){
            case 1:
            case 2:
            case 3:
                System.out.println("Você digitou o numero 1, 2 OU 3");break;
            case 11:
                System.out.println("Você digitou o numero 11");break;
            case 4:
                System.out.println("Você digitou o numero 4");break;
            case 5:
                System.out.println("Você digitou o numero 5");break;
            default:
                System.out.println("ERRO");
            }

        System.out.println("Gostou do programa?");
        String letra = input.next();
        
        switch(letra){
            case "SIM":
            case "s"  :
            case "sim":
                System.out.println("MUITO OBRIGADO");break;
            case "Nao":
            case "Não":
            case "nao":
            case "não":
            case "n"  :
                System.out.println("AFF");break;
            default:
                System.out.println("???????????");
        }
    }
}
