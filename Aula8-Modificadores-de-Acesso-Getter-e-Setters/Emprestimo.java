import java.util.Date;

public class Emprestimo
{
    private Cliente cliente;
    private Livro livro;
    private Date dataDoEmprestimo;
    private Date dataDeRetorno;
    
    public Cliente getClient() {
        return this.cliente;
    }
    
    public void setClient(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Livro getLivro() {
        return this.livro;
    }
    
    public void setLivro(Livro livro) {
        if(this.livro.getTitulo() != null) {
            this.livro = livro;
        }
        else {
            System.out.println("Erro: Livro não possui título");
        }
    }
}
