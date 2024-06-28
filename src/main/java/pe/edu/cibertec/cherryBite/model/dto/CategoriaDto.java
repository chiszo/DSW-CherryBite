package pe.edu.cibertec.cherryBite.model.dto;

import lombok.Data;

@Data
public class CategoriaDto implements DtoEntity {
    private int idcategoria;
    private String descripcion;
}
