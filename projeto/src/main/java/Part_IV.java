public class Part_IV {
    public static void main(String[] args) {
   
       int a = 10;
       int b = 20;
       int maior, menor, n, p;
       String S;
       boolean x = false;
       
       
       // condição ? caso verdadeiro : caso falso;
       
       maior = (a<b) ? 500 : 1000;
       menor = (a>b) ? 500 : 1000;
       n = x ? 1 : 2;
       p = true ? 1: 2;
       
       S = (a>b) ? "GLS" : "povo animado";
       
       
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(S);
        System.out.println(n);
        System.out.println(p);
 
        x = true;
        n = x ? 1 : 2;
        System.out.println(n);
        
    }
}
