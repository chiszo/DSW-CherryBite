package pe.edu.cibertec.cherryBite.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.cherryBite.model.bd.Usuario;
import pe.edu.cibertec.cherryBite.service.UsuarioService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "apiweb/cherry/usuario")
public class UsuarioController {
    private UsuarioService usuarioService;

}
