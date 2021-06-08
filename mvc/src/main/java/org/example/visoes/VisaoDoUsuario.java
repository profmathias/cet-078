package org.example.visoes;

import org.example.controles.ControleDeUsuario;
import org.example.modelos.ModeloDoUsuario;

import java.util.Scanner;

public class VisaoDoUsuario {

    private final ControleDeUsuario controleDeUsuario;
    Scanner scanner = new Scanner(System.in);

    public VisaoDoUsuario(ControleDeUsuario controleDeUsuario) {
        this.controleDeUsuario = controleDeUsuario;
    }

    public void menuDeUsuario() {
        int opcao;
        do {
            System.out.println("----- Menu Usuario -----");
            System.out.println("1. Inserir novo usuário");
            System.out.println("2. Remover um usuário");
            System.out.println("3. Buscar um usuário");
            System.out.println("4. Listar Usuários");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    this.lerNovoUsuario();
                    break;
                case 2:
                    this.lerIdParaRemocao();
                    break;
                case 3:
                    this.lerIdParaBusca();
                    break;
                case 4:
                    this.listaDeUsuarios();
                    break;
                default:
                    System.out.println("Opção Inválido!");
            }
        } while(opcao != 5);
    }

    public void listaDeUsuarios() {
        System.out.println("-------- LISTA DE USUARIOS ----------");
        for(ModeloDoUsuario usuario: this.controleDeUsuario.todosOsUsuarios()) {
            System.out.println(usuario.getId() + ": " + usuario.getNome());
        }
    }

    public void lerIdParaRemocao() {
        System.out.println("Digite o nome do usuario a ser removido.");
        String id = this.scanner.nextLine();
        this.controleDeUsuario.removerUsuario(id);
    }

    public void lerNovoUsuario() {
        System.out.println("Digite os dados do novo usuario:");

        System.out.println("Id: ");
        String id = scanner.nextLine();

        System.out.print("Nome: ");
        String nome = this.scanner.nextLine();

        System.out.println("E-mail: ");
        String email = this.scanner.nextLine();

        System.out.println("Endereço: ");
        String endereco = this.scanner.nextLine();

        ModeloDoUsuario usuario = new ModeloDoUsuario(id, nome, email, endereco);

        this.controleDeUsuario.adicionarUsuario(usuario);
    }

    public void lerIdParaBusca() {
        System.out.println("Digite o nome do usuário que deseja encontrar: ");
        String nome = this.scanner.nextLine();
        ModeloDoUsuario usuario = this.controleDeUsuario.buscarUsuario(nome);
        this.imprimirUsuario(usuario);
    }

    private void imprimirUsuario(ModeloDoUsuario usuario) {
        if(usuario == null) {
            System.out.println("Usuário Inválido!");
        }
        else {
            System.out.println("--------USUARIO--------");
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("E-mail:" + usuario.getEmail());
            System.out.println("Endereço:" + usuario.getEndereco());
        }
    }
}
