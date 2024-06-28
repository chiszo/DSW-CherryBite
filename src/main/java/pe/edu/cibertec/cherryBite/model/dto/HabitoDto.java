package pe.edu.cibertec.cherryBite.model.dto;

import lombok.Data;

@Data
public class HabitoDto implements DtoEntity {
    private int idhabito;
    private String descripcion;
    private int idcategoria;
    private String frecuencia;
    private java.sql.Time horadia;
    private java.sql.Date fechainicio;
    private java.sql.Date fechafin;
    private int progreso;
}
