
public class Personagem extends ElementoPosicional
{
    private String nome;
    private int forca = 10;
    private int defesa = 10;
    private int life = 50;
    private int nivel = 1;

    /**
     * COnstrutor para objetos da classe Personagem
     */
    public Personagem(String nome, int x, int y)
    {
        super(x, y);
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
