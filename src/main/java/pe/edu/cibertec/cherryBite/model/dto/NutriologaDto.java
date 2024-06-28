package pe.edu.cibertec.cherryBite.model.dto;

import lombok.Data;

@Data
public class NutriologaDto implements DtoEntity {
    private Integer idnutriologa;
    private String nombres;
    private String apellidos;
    private String email;
    private String telf;
}
