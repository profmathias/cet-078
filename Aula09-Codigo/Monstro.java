
public class Monstro extends Personagem
{
    int pontuacao;  
    
    public Monstro(String nome, int forca, int defesa, int vida, int pontuacao) {
        super(nome, forca, defesa, vida);
        this.pontuacao = pontuacao;
    }
    
    public void imprimir() {
        System.out.println("----------- Monstro -----------");
        super.imprimir();
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("-");
    }
    
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    public int getPontuacao() {
        return this.pontuacao;
    }
}
