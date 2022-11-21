import java.util.Scanner;

public class Part_I {

    public static void main(String[] args) {
   
        int x = 20;
        int z = 3;
        double y = 11.3;
        int t;
        
        Scanner input = new Scanner(System.in);
        Scanner outro = new Scanner(System.in);
        
        System.out.println("Oi, você tem " + x + " anos");
        
        //Por mais q a variavel (res) seja double, o resultado sera int pois as variaveis da 
        //são inteira, nessa conta por exemplo o correto é dar 6,6666 mas da 6,0
        double res = x/z;
        double ra = x/(double)z; // casting for uma variavel a ser de outro tipo 
                                 // double ra = x(double)/z; // neste caso o x sera double
                                 // double ra = (double)(x/z); o resultado será transformado em double
                                 // Porém o resultado será inteiro então n ha mais como converter
        x += 2;
        // x -= 2; (18) 
        // x++ e ++x pós e pre incremento
        // x-- e --x pós e pre decremento
        // x *= 2; (40)
        // x /= 2; (10)
        // x %= 2;  (0)
        
        final int EXEMPLO = 2; // com o final esta variavel não pode ser mudada, sempre será 2;
        
        
        System.out.println("Depois de 2 anos voce tem " + x + " anos");
        System.out.println(x - y);
        System.out.print("resultado sem casting: " + res); //ln é tipo um \n só q só funciona uma vez
        System.out.println(" Resultado com casting: " + ra);
        System.out.println("Digite um numero: ");
        int numero = input.nextInt();
        System.out.println("Digite outro numero: ");
        t = input.nextInt();
        
        System.out.println("O resultado é:" + (EXEMPLO + numero + t));
        
        int v = numero%2;
        
        if (v == 1){
            System.out.println("O primeiro numero é IMPAR");
        } 
        else {
            System.out.println("O primeiro numero é PAR");
        }
        
        
}
    
}
