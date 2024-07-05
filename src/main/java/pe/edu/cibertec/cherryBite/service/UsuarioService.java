package pe.edu.cibertec.cherryBite.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.cherryBite.model.bd.Usuario;
import pe.edu.cibertec.cherryBite.repository.RolRepository;
import pe.edu.cibertec.cherryBite.repository.UsuarioRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class UsuarioService implements IUsuarioService{

    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario obtenerUsuarioPorNomUsuario(String nomususario) {
        return usuarioRepository.findByNomusuario(nomususario);
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.guardarUsuario(usuario.getNomusuario(),
                usuario.getEmail(),
                usuario.getPassword(),
                usuario.getNombres(),
                usuario.getApellidos());
    }
}
