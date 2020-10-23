
public class Monstro extends Personagem
{
    
    private boolean controlavel = false;
    private boolean inimigo = true;
    
    public Monstro(String nome, int x, int y)
    {
        super(nome, x, y);
    }
    
    public void renderizar() {
        System.out.println("------ Monstro: " + this.getNome());
        super.renderizar();
        System.out.println("Controlável: " + this.controlavel);
        System.out.println("Inimigo: " + this.inimigo);
        System.out.println("------");
    }
}
