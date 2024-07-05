package pe.edu.cibertec.cherryBite.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.cherryBite.model.bd.Nutriologa;
import pe.edu.cibertec.cherryBite.model.bd.Persona;
import pe.edu.cibertec.cherryBite.model.bd.Sexo;
import pe.edu.cibertec.cherryBite.model.bd.Usuario;
import pe.edu.cibertec.cherryBite.model.dto.PersonaDto;
import pe.edu.cibertec.cherryBite.repository.PersonaRepository;

import java.util.Optional;

@Service
public class PersonaService implements IPersonaService{

    PersonaRepository  personaRepository;

    @Override
    public void actualizarPersona(Integer idusuario,Integer idnutriologa, Integer edad, Integer idsexo) {
        personaRepository.actualizarPersona1(idusuario,idnutriologa,edad,idsexo);
    }

    @Override
    public Persona obtenerUsuarioPorIdusuario(Integer idusuario) {
        Usuario usuario=new Usuario();
        usuario.setIdusuario(idusuario);
        Persona persona= personaRepository.findByUsuario(usuario);
        if(persona == null){
            return null;
        }
        return persona ;
    }
}
