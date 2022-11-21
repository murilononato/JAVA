public class Princi {
    public static void main(String[] args) {
        Video v[] = new Video[5];
        
        v[0] = new Video("Aula 1 de poo");
        v[1] = new Video("Aula 2 de poo");
        v[2] = new Video("Aula 3 de poo");
        v[3] = new Video("Aula 4 de poo");
        v[4] = new Video("Aula 5 de poo");
        
        Inscritos i[] = new Inscritos[2];
        i[0] = new Inscritos("Murilo", 19, "M", "muh.nonato");
        i[1] = new Inscritos("Rayane", 20, "F", "ray.alves69");
        /*
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(v[3].toString());
        System.out.println(v[4].toString());                        
        System.out.println("\n\n--------------------------\n");
        
        
        System.out.println( i[0].toString());
        System.out.println("");
        System.out.println( i[1].toString());*/
    
        Visualizacao visu[] = new Visualizacao[5];
        visu[0] = new Visualizacao(i[0] , v[4]);
        visu[0].avaliar(90.0f);
        System.out.println(visu[0].toString());
        
        visu[1] = new Visualizacao(i[1] , v[1]);
        System.out.println("");
        visu[1].avaliar();
        System.out.println(visu[1].toString());
       
        visu[2] = new Visualizacao(i[1] , v[1]);
        System.out.println("");
        visu[2].avaliar();
        System.out.println(visu[2].toString());
        
    

        
   
        }
}
