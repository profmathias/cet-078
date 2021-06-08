package org.example;

import org.example.controles.ControleDeUsuario;
import org.example.visoes.VisaoDoUsuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ControleDeUsuario controleDeUsuario = new ControleDeUsuario();
        VisaoDoUsuario visaoDoUsuario = new VisaoDoUsuario(controleDeUsuario);

        visaoDoUsuario.menuDeUsuario();
    }
}
