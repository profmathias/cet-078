
/**
 * Escreva a descrição da classe GerenciadorDeFormas aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class GerenciadorDeFormas
{
    private Retangulo retangulo1 = new Retangulo();
    private Retangulo retangulo2 = new Retangulo();


    public GerenciadorDeFormas()
    {
        // inicializa variáveis de instância
    }


    public void imprimir() 
    {
        retangulo1.setBaseEAltura(2,3);
        retangulo2.setBaseEAltura(5,7);
        retangulo1.imprimir();
        retangulo2.imprimir();
    }
}
