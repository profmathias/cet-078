
public class Funcionario extends Pessoa
{
    private int codigo;
    private Departamento departamento;
    private boolean autorizado;

    
    public void definirFuncionario(String n, int c, Departamento d, boolean aut) {
        nome = n;
        codigo = c;
        departamento = d;
        autorizado = aut;
    }
    
    public void darEntrada(Estoque e, Produto p) {
        if(autorizado) {
            e.adicionarProduto(p);
        }
    }
    
    public void darSaida(Estoque e, Produto p) {
    }
}
