package org.profmathias;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GerenciadorDeFormas gerenciador = new GerenciadorDeFormas();
        int opcao = gerenciador.menu();
        JOptionPane.showMessageDialog(null, "A opção escolhida foi: " + opcao);
    }
}
