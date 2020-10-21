
public class Monstro extends Personagem
{
    
    private boolean controlavel = false;
    private boolean inimigo = true;
    
    public Monstro(String nome, int x, int y)
    {
        super(nome, x, y);
    }
    
    public void renderizar() {
        System.out.println("O monstro " + getNome() + 
            " está em X:" + getX() + " e Y:" + getY()); 
    }
}
