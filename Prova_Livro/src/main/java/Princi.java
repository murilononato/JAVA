public class Princi {
    public static void main(String[] args) {
        Pessoa[] p  = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Murilo" , 19 , "M");
        p[1] = new Pessoa("Ana" , 13 , "F");
        
        l[0] = new Livro("Harry Potter" , "JK" , 199, "Murilo");     
        l[1] = new Livro("Percy Jackson" , "Sla " , 123 , "Ana");
        l[2] = new Livro("Naruto 12" , "Kishimoto" , 321, "Ana");
      
        l[0].abrir();
        l[0].folhear(200);
        System.out.println(l[0].detalhes());
     
}
}
