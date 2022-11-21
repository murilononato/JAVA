public class Main {

    public static void main(String[] args) {
        
        //Quando executamos o ex1 ele abre o publoc do Contrutor adicionando a variavel 0 + 1,
        //Logo x == 1 pois adicionamos ela         
        
        Contrutor ex1 = new Contrutor(); // executando ++x e ++y primeira vez 
        System.out.println(ex1.x);          
        System.out.println(ex1.y);
        
        // mas quando executamos Contrutor novamente ele adiciona mais um a variavel x então
        // teoricamente a variavel x seria igual a 2 pois ela foi add +1 novamente
        // porem n é isso q acontece já que quando criamos a outra variavel outra parte da memoria é
        // criado e assim criariamos "2 variaveis x" então como a variavel x comeca no 0
        // e é adicionanda 1 dnv as duas variaveis ex1 e ex2 são iguais a 1 e não a variavel x == 2
        
        Contrutor ex2 = new Contrutor(); // executando ++x e ++y segunda vez 
        System.out.println(ex2.x);
        System.out.println(ex2.y);
        
        }
    
}
