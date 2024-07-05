package pe.edu.cibertec.cherryBite.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.cherryBite.model.bd.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Transactional
    @Modifying
    @Query(value = "{call sp_guardarpersonUsuario(:nomususario, :email,:password, :nombres, :apellidos)}",
    nativeQuery = true)
    Usuario guardarUsuario(@Param("nomususario") String nomususario,
                        @Param("email") String email,
                        @Param("password") String password,
                        @Param("nombres") String nombres,
                        @Param("apellidos") String apellidos);
    Usuario findByNomusuario(String nomusuario);
    Usuario findByNombres(String nombres);
}
