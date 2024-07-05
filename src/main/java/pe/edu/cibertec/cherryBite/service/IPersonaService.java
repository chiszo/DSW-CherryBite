package pe.edu.cibertec.cherryBite.service;

import org.springframework.data.jpa.repository.Query;
import pe.edu.cibertec.cherryBite.model.bd.Persona;
import pe.edu.cibertec.cherryBite.model.bd.Usuario;
import pe.edu.cibertec.cherryBite.model.dto.PersonaDto;

public interface IPersonaService {
    void actualizarPersona(Integer idusuario,Integer idnutriologa, Integer edad, Integer idsexo);
    Persona obtenerUsuarioPorIdusuario(Integer idusuario);
}
