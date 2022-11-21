public class Princi {
    public static void main(String[] args) {
        Lutadores L [] = new Lutadores[6]; 
                
                   L[0] = new Lutadores("Pedrin", "Brasil", 45, 65.8f , 1.70f , 2, 5, 11);
                   L[1] = new Lutadores("Jacker", "EUA", 33, 103.0f , 1.75f , 2, 6, 8);  
                   L[2] = new Lutadores("Muele", "Tailandia", 31, 56.8f , 1.73f , 0, 2, 10);
                   L[3] = new Lutadores("Tokiro", "Japão", 29, 82.3f , 1.87f , 3, 3, 12);
                   L[4] = new Lutadores("Hewdrem", "Escócia", 38, 67.1f , 1.91f , 4, 5, 9);
                   L[5] = new Lutadores("Abner", "Africa do Sul", 56, 95.5f , 1.90f , 5, 3, 10);
                   
               Luta UFC01 = new Luta();
               UFC01.marcarLuta(L[0], L[1]);
               UFC01.lutar();
               L[0].status();
               L[2].status();
}
}
