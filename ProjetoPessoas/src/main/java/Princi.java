public class Princi {
    public static void main(String[] args) {
      Pessoa p1 = new Pessoa();
      Aluno p2 = new Aluno();
      Prof p3 = new Prof();
      Funcionario p4 = new Funcionario();
      
      p1.setNome("Murilo");
      p2.setNome("Duda");
      p3.setNome("Ray");
      p4.setNome("Thali");
      
      p2.setCurso("Jogos Digitais");
      p2.setMatricula(123123);
      
      p3.setSexo("F");
      p1.setIdade(19);
      p1.fazerAniversario();
      
      p4.mudaTrabalho();
      p4.setSetor("Vendas");
      
      p3.setEspecialidade("Química");
      p3.setSalario(1000);
      p3.aumento(13);
      
      
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
      
      
      p2.status();
      p4.status();
      p3.status();
}
}
