
public class Operador extends Funcionario
{
    int horasExtra;
    
    public Operador(int matricula, String nome, double salarioBase, int horasExtra) {
        super(matricula, nome, salarioBase);
        this.horasExtra = horasExtra;
    }
    
    public double calcularSalario() {
        return this.getSalarioBase() + (this.horasExtra * 100);
    }
}
