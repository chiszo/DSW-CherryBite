package pe.edu.cibertec.cherryBite.service;

import pe.edu.cibertec.cherryBite.model.bd.Persona;
import pe.edu.cibertec.cherryBite.repository.PersonaRepository;

public class PersonaService implements IPersonaService{

    PersonaRepository  personaRepository;

    @Override
    public void actualizarUsuario(Persona persona) {
        personaRepository.actualizarPersona1(persona.getIdusuario(),
                persona.getNutriologa().getIdnutriologa(),
                persona.getEdad(),persona.getSexo().getIdsexo());
    }
}
