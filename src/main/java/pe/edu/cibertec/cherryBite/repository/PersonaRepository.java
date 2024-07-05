package pe.edu.cibertec.cherryBite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.cherryBite.model.bd.Persona;
import pe.edu.cibertec.cherryBite.model.bd.Usuario;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

    @Query(value = "{call spActualizarUsuario(:p_idusuario,:p_idnutriologa,:p_edad,:p_idsexo)}",
            nativeQuery = true)
    void actualizarPersona1(@Param("p_idusuario") Integer idusuario,
                            @Param("p_idnutriologa") Integer idnutriologa,
                            @Param("p_edad") Integer edad,
                            @Param("p_idsexo") Integer idsexo);

    Persona findByUsuario(Usuario usuario);
}
