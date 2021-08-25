public class Compra
{
    private Cliente cliente;
    private float total;
    
    public void setCliente(Cliente clienteInformado) {
        cliente = clienteInformado;
    }
    
    public float calcularTotal() {
        cliente.setIdade(19);
        return cliente.getIdade()*100;
    }
}
