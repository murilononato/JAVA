package Exercicios;

public class Inverter {
    public static void main(String[] args) {
        
        double[] num = {1,2,3,4,5};
        double[] inv = troca(num);
        
        for(int i = 0; i<inv.length; ++i){
            
            System.out.println(inv[i]);
            
        }
        
    }
    public static double[] troca(double[] abc) {
        
        double[] xyz = new double [abc.length];     
        
        for (int i = 0, j=xyz.length - 1; i<abc.length; ++i,--j){
            
            xyz[j] = abc[i];
            
        }
        
        return xyz;
        
    }
}
