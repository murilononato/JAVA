
import java.util.Scanner;

public class Array { 
    public static void main(String[] args) {
   
       int num; 
       
       Scanner input = new Scanner (System.in); 
          
       System.out.println("Digite o numero de alunos: ");
       num = input.nextInt();
        
       double[] NotasAlunos = new double [num]; // ou numeral [5]
        
       for(int i = 0; i<num; ++i){
           System.out.println("Digite a nota do " + (i+1) + "º aluno");
           NotasAlunos[i] = input.nextDouble();// o i comeca no zero entao esta é a primeira posição 
       } 
       
        
       for(int i = 0; i<num; ++i){
           System.out.println("nota do " + (i+1) + "º aluno: " + NotasAlunos[i]);
       } 
       
        
}
}
