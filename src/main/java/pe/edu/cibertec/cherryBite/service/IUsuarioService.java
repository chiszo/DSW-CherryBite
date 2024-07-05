package pe.edu.cibertec.cherryBite.service;

import pe.edu.cibertec.cherryBite.model.bd.Usuario;

import java.util.List;

public interface IUsuarioService {
    Usuario obtenerUsuarioPorNomUsuario(String nomususario);
}
