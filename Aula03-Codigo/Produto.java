public class Produto
{
    private int codigo;
    private String nome;
    private float preco;
    private Categoria categoria;
    
    public void definirProduto(int co, String n, float p, Categoria ca) {
        codigo = co;
        nome = n;
        preco = p;
        categoria = ca;
    }
}
