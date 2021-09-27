import java.util.ArrayList;
import java.util.Scanner;

public class Estoque
{
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    public void menu() {
        int opcao = -1;
        Scanner scanner = new Scanner(System.in);
        
        while(opcao != 0) {
            System.out.println("----------------- Estoque ----------------");
            System.out.println("1. Entrada no Estoque");
            System.out.println("2. Saída do Estoque");
            System.out.println("3. Relatório");
            System.out.println("0. Sair");
            
            opcao = scanner.nextInt();
            
            switch(opcao) {
                case 0:
                    return;
                case 1:
                    entrada();
                    break;
                case 2:
                    saida();
                    break;
                case 3:
                    relatorio();
                    break;
                default:
                    System.out.println("Opção de Estoque Inválida");
            }
        }
    }
    
    public void entrada() {
        Produto produto = new Produto();
        Categoria cat = new Categoria(1, "Higiene");
        produto.definirProduto(1, "Sabonete", 3.50f, cat);
        produtos.add(produto);
        System.out.println(produto.getNome() + " adicionado ao estoque");
    }
    
    public void saida() {
        Produto produto = new Produto();
        produtos.remove(produto);
    }
    
    public void relatorio() {
        System.out.println("------------ Relatório de Estoque ----------------");
        for(Produto produto: this.produtos)
        {
            System.out.println(produto.getNome());
        }
        System.out.println("------------ Fim ----------------");
    }
}
