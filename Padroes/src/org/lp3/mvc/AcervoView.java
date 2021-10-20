package org.lp3.mvc;

import java.util.ArrayList;
import java.util.Scanner;

public class AcervoView {
	
	private AcervoController controller;
	
	public AcervoView(AcervoController controller) {
		this.controller = controller;
	}
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		do {
			
			System.out.println("Escolha uma opção:");
			System.out.println("1. Consultar Acervo");
			System.out.println("2. Adicionar Livro");
			System.out.println("0. Para sair");
			
			opcao = sc.nextInt();
			sc.nextLine();
	
			
			switch(opcao) {
				case 1:
					ArrayList<LivroModel> livros = controller.getLivros();
					for(LivroModel livro: livros) {
						System.out.println("---------");
						System.out.println("Título: " + livro.getTitulo());
						System.out.println("Autor: " + livro.getAutor());
						System.out.println("---------");
					}
					break;
				case 2:
					System.out.println("Digite o título do livro:");
					String titulo = sc.nextLine();
					System.out.println("Digite o autor do Livro:");
					String autor = sc.nextLine();
					
					controller.addLivro(titulo, autor);
				case 0:
					break;
				default:
			}
		} while(opcao != 0);
				
		sc.close();
	}

}
