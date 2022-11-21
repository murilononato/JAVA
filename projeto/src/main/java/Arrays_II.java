public class Arrays_II {
    public static void main(String[] args) {
   
        int[] x = new int [10];
        int[] y = {01,20,3,4,55,6,7};
        
        x[9] = 23;
        x[3] = 7;
       
         for (int i = 0; i <y.length; ++i){ 
            System.out.println(y[i]);
    } 
        System.out.println("");
        System.out.println("");

        
        for (int i = 0; i <x.length; ++i){ //x.length pega o tamanho do array
            System.out.println(x[i]);
    }
        
        System.out.println("");
        System.out.println("Apos modificação");
        System.out.println("");
        
    x[1] = x[3] + x[9];
    
    /*
        Quando temos um Array vazio ele é denominado de 0
    */
    
    
    
    java.util.Arrays.fill(x, 101); // todos os valores  se tornaram 101 
    
      for (int i = 0; i <x.length; ++i){ //x.length pega o tamanho do array
            System.out.println(x[i]);
    }
      
      System.out.println("");
      System.out.println("Apos modificação");
      System.out.println("");
      
       // 0 até 2 será 50 o valor porém o valor 0 é incluso e o 2 não, no caso em vez de ser:
       // 0 1 e 2 = 50 SERA apenas 0 e 1, pois comeca no zero e um antes do 2
       
      java.util.Arrays.fill(x, 0,2, 50);
      
      for (int i = 0; i <x.length; ++i){ //x.length pega o tamanho do array
            System.out.println(x[i]);
    }
        
}
}
