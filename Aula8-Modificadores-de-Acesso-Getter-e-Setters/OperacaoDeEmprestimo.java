import java.util.ArrayList;
import java.util.List;

public class OperacaoDeEmprestimo
{
    private int id;
    private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    
    public List<Emprestimo> getEmprestimos() {
        return this.emprestimos;
    }
    
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        this.emprestimos.add(emprestimo);
    }
}
