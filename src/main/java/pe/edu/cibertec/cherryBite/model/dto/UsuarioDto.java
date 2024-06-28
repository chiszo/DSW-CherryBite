package pe.edu.cibertec.cherryBite.model.dto;

import lombok.Data;

@Data
public class UsuarioDto implements DtoEntity {
    private int idusuario;
    private String nomusuario;
    private String email;
    private String password;
    private String nombres;
    private String apellidos;
    private Boolean activo;
}
