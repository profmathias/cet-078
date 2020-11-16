package com.exemplo;

import javax.swing.JOptionPane;
import com.exemplo.formas.Quadrado;

public class GerenciadorDeFormas {

  public static void main(String[] args) {

    String formaStr = JOptionPane.showInputDialog("Digite o nome da forma que deseja adicionar...");

    switch(formaStr) {
      case "quadrado":
        String valor = JOptionPane.showInputDialog("Digite o valor do lado do quadrado.");
        double lado = new Double(valor);

        Quadrado forma = new Quadrado(lado);
        forma.imprimir();
        break;
      default:
        JOptionPane.showMessageDialog(null, "Forma não conhecida.");
    }
  }
}
