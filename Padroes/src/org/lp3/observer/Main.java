package org.lp3.observer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcao;
		int contador = 0;
		Subject<String> subject = new NotificadorSubject();
		
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1. Nova Mensagem.");
			System.out.println("2. Adicionar Observador.");
			System.out.println("0. Sair");
			opcao = sc.nextInt();

			switch (opcao) {
				case 1 -> {
					subject.notifyObservers("Mensagem número " + contador);
					contador++;
				}
				case 2 -> {
					Observer observer = new ObservadorDeMensagem();
					subject.attach(observer);
				}
				case 0 -> {
					sc.close();
					System.exit(0);
				}
				default -> System.out.println("Opção Inválida...");
			}
			
		} while(true);
		
	}

}
