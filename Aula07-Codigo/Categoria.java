
public class Categoria
{
    private int codigo;
    private String nome;
    private Departamento departamento;
    
    public void definirCategoria(int co, String n, Departamento d) {
        codigo = co;
        nome = n;
        departamento = d;
    }
}
