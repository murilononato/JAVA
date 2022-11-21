
import java.util.Scanner;

public class Metodo_II {
    public static void main(String[] args) { // String[] args = vetor[] de String chamado args
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a base do Triangulo: ");
        double base = input.nextDouble();
        
        System.out.println("Digite a altura do Triangulo: ");
        double altura = input.nextDouble();
             
        double resultado = Triangulo(base, altura);
       
        System.out.println("A área do seu retangulo é: " + resultado);
        System.out.println("---------------------------");
        System.out.println(Triangulo(base, altura));
    }
    public static double Triangulo(double base, double altura) { 
        
        return (base*altura)/2;
    }
}
