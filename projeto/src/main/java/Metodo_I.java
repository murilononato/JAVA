
import java.util.Scanner;

public class Metodo_I {
    public static void main(String[] args) {
   
        retangulo();
        
}
    public static void retangulo() {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite a altura do retangulo");
        double altura = input.nextDouble();
        System.out.println("Digite a base do retangulo");
        double base = input.nextDouble();
        
        double area = base * altura;
        
        System.out.println("A área do retangulo é: " + area);
        
}
}
