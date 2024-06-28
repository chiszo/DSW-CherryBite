package pe.edu.cibertec.cherryBite.model.dto;

import lombok.Data;

@Data
public class GrupoAlimentoDto implements DtoEntity {
    private Integer idgrupoalimento;
    private String descripcion;
}
