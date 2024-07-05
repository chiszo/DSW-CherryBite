package pe.edu.cibertec.cherryBite.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.cherryBite.exception.ResourceNotFoundException;
import pe.edu.cibertec.cherryBite.model.bd.Persona;
import pe.edu.cibertec.cherryBite.model.dto.PersonaDto;
import pe.edu.cibertec.cherryBite.service.DetalleUsuarioService;
import pe.edu.cibertec.cherryBite.service.IPersonaService;
import pe.edu.cibertec.cherryBite.service.PersonaService;

@AllArgsConstructor
@RestController
@RequestMapping(path = "apiweb/cherry/persona")
public class PersonaController {

    PersonaService personaService;

/*
    @PutMapping("/{id}")
    public ResponseEntity<Persona> actualizarpersona(
            @PathVariable Integer id,
            @RequestBody PersonaDto personaDto
    ){

        return new ResponseEntity<>(personaService.actualizarPersona(personaDto.getIdusuario()
                ,personaDto.getIdnutriologa(),
                personaDto.getEdad(),personaDto.getIdsexo()),
                HttpStatus.OK);
    }*/
}
