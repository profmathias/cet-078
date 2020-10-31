public abstract class Forma
{
    private String nome;
    
    public abstract float calcularArea();
    
    public abstract float calcularPerimetro();
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void imprimir() {
        System.out.println("Imprimindo a partir da classe Abstratra.");
        System.out.println(this.nome + " não sobrescreve método imprimir.");
    }
}
