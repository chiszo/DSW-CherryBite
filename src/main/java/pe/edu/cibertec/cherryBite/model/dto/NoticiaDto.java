package pe.edu.cibertec.cherryBite.model.dto;

import lombok.Data;

import java.sql.Blob;
import java.util.Date;

@Data
public class NoticiaDto implements DtoEntity{
    private Integer idnoticia;
    private String titulo;
    private String descripcion;
    private String imagen;
    private Date fecha;
}
