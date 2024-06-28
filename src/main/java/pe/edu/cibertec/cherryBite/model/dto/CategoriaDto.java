package pe.edu.cibertec.cherryBite.model.dto;

import lombok.Data;

@Data
public class CategoriaDto implements DtoEntity {
    private Integer idcategoria;
    private String descripcion;
}
