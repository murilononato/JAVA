
import java.util.Scanner;

public class Moedas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um valor em centavos:");
        int centavos = input.nextInt();
        
        int real = centavos /100;
        centavos = centavos % 100;
        
        System.out.println("O valor é de " + real + " reais e " + centavos + " centavos");
    }
}
