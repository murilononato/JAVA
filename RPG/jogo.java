public class jogo{
    public static void main(String[] args) {
        Personagem p[] = new Personagem[2];
        Mascote m[] = new Mascote[2];

        p[0] = new Personagem("Kiro","Vigia");
        p[1] = new Personagem("Mandrake", "Feiticeiro");

        m[0] = new Mascote("Ratão", "Veneno", 12, p[0]);
        m[1] = new Mascote("Cobrona", "Veneno", 16, p[1]);

        m[0].status();
    }
}