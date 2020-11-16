package com.exemplo.formas;

import javax.swing.JOptionPane;

public class Quadrado {
  private double lado;

  public Quadrado(double lado) {
    this.lado = lado;
  }

  public void imprimir() {
    JOptionPane.showMessageDialog(null, "Eu sou um quadrado de lado = " + lado);
  }
}
