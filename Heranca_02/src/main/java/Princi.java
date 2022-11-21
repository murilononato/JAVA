public class Princi {
   public static void main(String[] args) {
   
       Visitante v1 = new Visitante(); // Herança pobre ja que Visitante n atribui nada de novo
       //mas pode ser instanciado normalmente 
       
       v1.setNome("Ana Clara");
       v1.setIdade(19);
       v1.setSexo("F");
       
     //Pessoa p1 = new Pessoa(); 
     //Não poderia ser criado ja que a classe Pessoa é uma classe abstrata 
     //ou seja uma classe q pode ter filhos mas n pode ser instanciada

       Aluno a1 = new Aluno();
       a1.setNome("João Pedro");
       a1.setIdade(21);
       a1.setSexo("M");
       a1.setMatricula(34213421);
       a1.setCurso("Engenharia");
       
       Bolsista b1 = new Bolsista();
       b1.setNome("Carlos");
       b1.setIdade(22);
       b1.setSexo("M");
       b1.setMatricula(34213424);
       b1.setCurso("Direito");
       
       Tecnico t1 = new Tecnico();
       
       t1.setNome("Julia");
       t1.setIdade(23);
       t1.setSexo("F");
       t1.setMatricula(34213522);
       t1.setCurso("Textil e Moda");
       
       System.out.println("");
       
       Prof p1 = new Prof();
       p1.setNome("Raimundo");
       p1.setIdade(53);
       p1.setSexo("M");
       p1.setSalario(1500.65f);
      
       
       System.out.println(p1.toString());
       System.out.println("Salrio: " + p1.getSalario());
       p1.aumenarSalario(0.35f);
       
       System.out.println("");
       
       t1.status();
       t1.PagarMensalidade();
       t1.praticar();
       
       System.out.println("");
       
       System.out.println(v1.toString());
       a1.status();
       a1.PagarMensalidade();
       
       System.out.println("");
       
       b1.status(); // status esta na classe Aluno mas mesmo assim pode ser 
       //instanciado na classe Bolsista por conta do extends 
       b1.setBolsa(120.4f);
       b1.PagarMensalidade();
   
       
       
   }
    
}
