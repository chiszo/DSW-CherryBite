package pe.edu.cibertec.cherryBite.model.dto;

import lombok.Data;

@Data
public class AlimentoDto implements DtoEntity {
    private int idalimento;
    private String nombre;
    private int porcion;
    private int idgrupoalimento;
    private String descripcion;
    private String imagen;
    private int idvalornutricional;
}
