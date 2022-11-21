public class Princi {
    public static void main(String[] args) {
    //Animal n = new Animal(); NAO PODE SER EXECUTADO POÍS ANIMAL É UM OBJETO ABSTRATO
    mamifero m = new mamifero();
    reptil r = new reptil();
    peixe p = new peixe();
    ave a = new ave();
    Canguru c = new Canguru();
    Gato g = new Gato();
    /*
    g.alimentar();
    g.emitirSom();
    g.locomover();
    
        System.out.println("");
    
    c.locomover();
    c.usarBolsa();
    
        System.out.println("");
    
    m.setPeso(23.3f);
    m.setCorPelo("Marrom");
    m.alimentar();
    m.locomover();
    m.emitirSom();*/
    
    Cachorro k = new Cachorro();
    k.emitirSom();
    k.reagir("vms passear");
    k.reagir("CACHORROO");
    k.reagir(true);
    k.reagir(false);
    k.reagir(10, 10);
    k.reagir(20, 10);
    k.reagir(10, 10.0f);
    k.reagir(1, 10.0f);
}
}
