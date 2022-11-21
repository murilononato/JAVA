public class Princi {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "AMARELO", 0.3f);
        c1.status();
        
        Caneta c2 = new Caneta("BIC", "VERDE", 0.2f);
        c2.status();
        
        /*
        //c1.setModelo("BIC"); PODERIAMOS CRIAR NORMALMENTE ESTA PARTE AQUI POIS MODELO É PUBLIC
        c1.modelo = "BIC";
        
        c1.setPonta(0.8f);
        // c1.ponta = 0.5f NESSA PARTE JA DARIA ERRO POIS PONTA É PRIVATE
        c1.status();
        
        //PODERIAMOS USAR c1.getModelo NORMALMENTE c1.modelo JÁ QUE ELE É PUBLIC
        // DIFERENTE DA PONTA QUE É PRIVATE c1.getPonta()
        
        
        System.out.println("TENHO UMA CANETA: " + c1.modelo + " DE PONTA: " +
               c1.getPonta());
               */
}
}
