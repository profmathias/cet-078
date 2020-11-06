
public abstract class Funcionario
{
   private int matricula;
   private String nome;
   private double salarioBase;
   
   public Funcionario(int matricula, String nome, double salarioBase) {
       this.matricula = matricula;
       this.nome = nome;
       this.salarioBase = salarioBase;
   }
   
   abstract public double calcularSalario();
   
   public void setMatricula(int matricula) {
       this.matricula = matricula;
   }
   
   public int getMatricula() {
       return this.matricula;
   }
   
   public void setNome(String nome) {
       this.nome = nome;
   }
   
   public String getNome() {
       return this.nome;
   }
   
   public void setSalarioBase(double salarioBase) {
       this.salarioBase = salarioBase;
   }
   
   public double getSalarioBase() {
       return this.salarioBase;
   }
}
