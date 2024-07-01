package pe.edu.cibertec.cherryBite.model.dto;

import lombok.Data;

@Data
public class AlimentoDto implements DtoEntity {
    private Integer idalimento;
    private String nombre;
    private Integer porcion;
    private String descripcionGrupoAlimento;
}
