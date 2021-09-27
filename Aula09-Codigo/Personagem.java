

public class Personagem
{
    private int vida;
    private int forca;
    private int defesa;
    private String nome;
    
    public Personagem(String nome, int forca, int defesa, int vida) {
        this.nome = nome;
        this.forca = forca;
        this.defesa = defesa;
        this.vida = vida;
        
    }
    
    public void imprimir() {
        System.out.println(nome + ": Vida (" + vida + "), Força(" + forca + ")"); 
    }
    
        
    public void atacar(Personagem p) {
        p.setVida(p.getVida() - this.getForca());
    }
    
    public void atacar(Personagem personagens[]) {
        for(Personagem p: personagens) {
            this.atacar(p);
        }
    }
    
    
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void setForca(int forca) {
        this.forca = forca;
    }
    
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getVida() {
        return this.vida;
    }
    
    public int getForca() {
        return this.forca;
    }
    
    public int getDefesa() {
        return this.defesa;
    }
    
}
