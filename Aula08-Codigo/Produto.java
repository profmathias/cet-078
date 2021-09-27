public class Produto
{
    private int codigo;
    private String nome;
    private float preco;
    private Categoria categoria;
    
    public void definirProduto(int codigo, String nome, float preco, Categoria cat) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoria = cat;
    }
    
    public String getNome() {
        return this.nome;
    }
}
