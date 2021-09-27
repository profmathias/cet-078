public class Heroi extends Personagem
{
    private int fase = 1;
    private String jogador;
    
    public Heroi(String nome, int forca, int defesa, int vida, String jogador) {
        super(nome, forca, defesa, vida);
        this.jogador = jogador;
    }

    public void imprimir() {
        System.out.println("----------- Herói -----------");
        System.out.println("Fase: " + this.fase);
        System.out.println("Jogador: " + this.jogador);
        super.imprimir();
        System.out.println("-");
    }
    
    public void setFase(int fase) {
        this.fase = fase;
    }
    
    public void setJogador(String jogador) {
        this.jogador = jogador;
    }
    
    public int getFase() {
        return this.fase;
    }
    
    public String getJogador() {
        return this.jogador;
    }
}
