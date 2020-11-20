import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Mercado {
    private ArrayList<String> listaDeCompras;
    private HashMap<String, Double> produtosDisponiveis;
    private HashMap<String, Integer> produtosNaCesta;

    public Mercado() {
        listaDeCompras = new ArrayList<String>();
        produtosDisponiveis = new HashMap<String, Double>();
        produtosNaCesta = new HashMap<String, Integer>();

        inicializaMercado();
    }

    public void adicionarItemNaLista(String item) {
        listaDeCompras.add(item);
    }

    public void adicionarItemNaCesta(String item, Integer quantidade) {
        produtosNaCesta.put(item, quantidade);
    }

    public double totalDaCesta() {
        double totalDaCesta = 0;
        for(Map.Entry<String, Integer> item: produtosNaCesta.entrySet()) {
            double precoTotal = 0;
            double precoDoItem = produtosDisponiveis.get(item.getKey());

            precoTotal = precoDoItem * item.getValue();

            System.out.println(item.getKey() + ": " + item.getValue() + " = " + precoTotal);

            totalDaCesta += precoTotal;
        }
        
        System.out.println("Total da Compra = " + totalDaCesta);
        return 0.0;
    }

    public void inicializaMercado() {
        produtosDisponiveis.put("batata", 3.5);
        produtosDisponiveis.put("biscoito", 2.0);
        produtosDisponiveis.put("beterraba", 4.0);
        produtosDisponiveis.put("banana", 5.0);
        produtosDisponiveis.put("detergente", 3.5);
    }
}