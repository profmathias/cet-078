package org.example.controles;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.example.modelos.ModeloDoUsuario;

import java.util.ArrayList;
import java.util.List;

public class ControleDeUsuario {

    private final List<ModeloDoUsuario> usuarios = new ArrayList<ModeloDoUsuario>();

    public ModeloDoUsuario buscarUsuario(String id) {
        for(ModeloDoUsuario usuario: this.usuarios) {
            if(usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    public List<ModeloDoUsuario> todosOsUsuarios() {
        return this.usuarios;
    }

    public void adicionarUsuario(ModeloDoUsuario usuario) {
        this.usuarios.add(usuario);
    }

    public void removerUsuario(String id) {
        ModeloDoUsuario usuario = this.buscarUsuario(id);
        if(usuario != null) {
            usuarios.remove(usuario);
        }
    }
}
