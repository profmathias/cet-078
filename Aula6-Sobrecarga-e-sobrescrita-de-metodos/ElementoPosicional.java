
public class ElementoPosicional
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;
    private int y;


    public ElementoPosicional()
    {
        // inicializa variáveis de instância
        x = 0;
        y = 0;
    }
    
    public ElementoPosicional(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y)
    {
        // ponha seu código aqui
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void renderizar() {
        System.out.println(
        "Em posição X: " + this.x +
        " Y: " + this.y
        );
    }
}
