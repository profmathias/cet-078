
public class Funcionario extends Pessoa
{
    private int codigo;
    private boolean autorizado;

    
    public void definirFuncionario(String n, int c, boolean aut) {
        nome = n;
        codigo = c;
        autorizado = aut;
    }
    
    public void darEntrada(Estoque e, Produto p) {
        if(autorizado) {
            e.entrada();
        }
    }
    
    public void darSaida(Estoque e, Produto p) {
    }
}
