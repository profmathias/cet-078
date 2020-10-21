public class Heroi extends Personagem
{
    public Heroi(String nome, int x, int y)
    {
        super(nome, x, y);
    }
    
    public void renderizar() {
        System.out.println("O Herói " + getNome() + 
            " está em X:" + getX() + " e Y:" + getY()); 
    }
}
