 public class Diretor extends Funcionario
{
    public Diretor(int matricula, String nome, double salarioBase) {
        super(matricula, nome, salarioBase);
    }
    
    public double calcularSalario() {
        return this.getSalarioBase() * 2;
    }
}
