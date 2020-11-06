import java.util.ArrayList;


public class RH
{
   private ArrayList<Funcionario> funcionarios;
   
   public RH() {
        this.funcionarios = new ArrayList<Funcionario>();
        this.funcionarios.add(new Diretor(1, "Fulano", 10000.0));
        this.funcionarios.add(new Operador(2, "Beltrano", 2500.0, 10));
        this.funcionarios.add(new Operador(3, "Sicrano", 2000.0, 2));
   }
   
   public void imprimirFolhaDePagamento() {
       for(Funcionario funcionario: funcionarios) {
           System.out.println(funcionario.getMatricula() + " " + 
                              funcionario.getNome() + 
                              " recebe " + funcionario.calcularSalario());
       }
   }
}
