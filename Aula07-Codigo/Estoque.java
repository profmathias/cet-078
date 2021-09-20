import java.util.ArrayList;

public class Estoque
{
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public void retiradaDeProduto(Produto prod) {
        produtos.remove(prod);
    }
}
