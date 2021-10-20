package org.lp3.fabrica_abstrata;

import java.util.Scanner;

import org.lp3.fabrica_abstrata.jfx.JFXFactory;
import org.lp3.fabrica_abstrata.swing.SwingFactory;

public class Main {

	public static void main(String[] args) {
		int opcao;
		GUIAbstractFactory fabrica = null;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual estilo de interface deseja utilizar?");
		System.out.println("1. SWING");
		System.out.println("2. JFX");
		opcao = sc.nextInt();
		sc.close();
		
		switch(opcao) {
			case 1:
				fabrica = new SwingFactory();
				break;
			case 2:
				fabrica = new JFXFactory();
				break;
			default:
				System.out.println("Opção Inválida!");
				System.exit(-1);
		}
		
		InterfaceDoUsuario gui = new InterfaceDoUsuario(fabrica);
		gui.create_components();
		gui.drawInterface();
	}

}
