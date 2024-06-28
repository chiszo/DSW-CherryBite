package pe.edu.cibertec.cherryBite.model.dto;

import lombok.Data;

@Data
public class PersonaDto implements DtoEntity {
    private Integer idpersona;
    private Integer idnutriologa;
    private Integer idusuario;
    private Double peso;
    private Double altura;
    private Double imc;
    private Integer edad;
    private Integer idsexo;
    private Boolean estado;
}
