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
    private RolRepository rolRepository;

    @Override
    public Usuario buscarUsuarioXNomUsuario(String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        /*
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        usuario.setActivo(true);
        Rol usuarioRol = rolRepository.findByNomrol("ADMIN");
        usuario.setRoles(new HashSet<>(Arrays.asList(usuarioRol)));
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return usuarioRepository.save(usuario);*/
        return null;
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        usuarioRepository.actualizarUsuario(
                usuario.getNombres(),usuario.getApellidos(),
                usuario.getActivo(),usuario.getIdusuario()
        );
    }

    @Override
    public List<Usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarUsuarioXIdUsuario(Integer idusuario) {
        return usuarioRepository.findById(idusuario).orElse(null);
    }
}
