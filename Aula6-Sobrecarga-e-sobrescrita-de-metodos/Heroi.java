public class Heroi extends Personagem
{
    public Heroi(String nome, int x, int y)
    {
        super(nome, x, y);
    }
    
    public void renderizar() {
        System.out.println("------ Herói: " + this.getNome());
        super.renderizar();
        System.out.println("------");
 
    }
}
