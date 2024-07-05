package pe.edu.cibertec.cherryBite.service;

import org.springframework.data.jpa.repository.Query;
import pe.edu.cibertec.cherryBite.model.bd.Persona;

public interface IPersonaService {
    void actualizarUsuario(Persona persona);
}
