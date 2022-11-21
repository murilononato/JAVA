
import java.util.Scanner;

public class Part_III {
    public static void main(String[] args) {
   
        Scanner num = new Scanner (System.in);
        
        int x = 0;
        int y = 0;
        int z = 0;
        
        while(x < 1){
        System.out.println(x);
        ++x;
        
        }
        
        do{
        System.out.println(x);
        x++; 
        }while(x<1);
    
        System.out.println("---------------------");
        
        do{
        System.out.println(z);
        z++; 
        }while(z<1);
         
        while(z < 1){
        System.out.println(z);
        ++z;
        
        }
        
        System.out.println("Digite um numero menor que 10:");
        y = num.nextInt();
        
        for(y = y;y<=10;y++){
        System.out.println(y);
        }
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("");

    for (int i = 0, j = 0; i <= 10 && j <= 10; i++, j++){
        System.out.println(i);
    }
    }
}
