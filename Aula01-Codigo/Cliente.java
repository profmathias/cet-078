public class Cliente
{
    public String nome;
    private String email;
    private String cpf;
    private String senha;
    private int idade;
    private int fidelidade;
    
    public void mudarSenha(String novaSenha) {
        //verificar se senha está dentro do padrão...
        senha = novaSenha;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int novaIdade) {
        idade = novaIdade;
    }
}