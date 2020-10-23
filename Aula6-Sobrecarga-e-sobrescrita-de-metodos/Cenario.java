
public class Cenario
{
    private Personagem[] personagens = {
        new Heroi("Mathias", 0, 0),
        new Monstro("Coringa", 10, 0)
    };
    
    public Cenario()
    {
        Personagem x = new Heroi("Mathias", 0, 0);
    }

    public void renderizar() {
        for(int i = 0; i < 2; i++) {
            personagens[i].renderizar();
        }
    }
}
