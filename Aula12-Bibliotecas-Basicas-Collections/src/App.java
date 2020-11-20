public class App {
    public static void main(String[] args) throws Exception {
        Mercado mercado = new Mercado();

        mercado.adicionarItemNaLista("beterraba");
        mercado.adicionarItemNaLista("detergente");

        mercado.adicionarItemNaCesta("beterraba", 2);
        mercado.adicionarItemNaCesta("detergente", 4);

        mercado.totalDaCesta();

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            System.exit(0);
        }
    }
}
