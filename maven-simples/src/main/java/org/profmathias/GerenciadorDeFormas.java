package org.profmathias;

import javax.swing.*;

public class GerenciadorDeFormas {
    public int menu() {
        String opcao = JOptionPane.showInputDialog(null,
                "Digite uma opção\n1.Circulo\n2.Retângulo\n3.Triângulo");

        return Integer.parseInt(opcao);
    }
}
