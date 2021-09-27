import java.util.Scanner;

public class Loja
{
    private Estoque estoque;
    private Cliente clientes[];
    private Funcionario funcionarios[];
    private Departamento departamentos[];
    
    public Loja() {
        this.estoque = new Estoque();
    }

    public void main(String args[]) {
        menu();
    }
    
    public void menu() {
        int opcao;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo à nossa loja!");
        System.out.println("1. Estoque");
        System.out.println("2. Compras");
        System.out.println("3. Devolução");
        
        opcao = scanner.nextInt();
        
        System.out.println("Opcao escolhida foi " + opcao);
        switch(opcao) {
            case 1:
                estoque.menu();
            case 2:
                return;
            case 3:
                return;
            default:
                System.out.println("Opção Inválida");
        }
        
    }
}
