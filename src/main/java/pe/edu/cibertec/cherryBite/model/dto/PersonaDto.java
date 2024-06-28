package pe.edu.cibertec.cherryBite.model.dto;

import lombok.Data;

@Data
public class PersonaDto implements DtoEntity {
    private int idpersona;
    private int idnutriologa;
    private int idusuario;
    private int peso;
    private int altura;
    private int imc;
    private int edad;
    private int idsexo;
    private boolean estado;
}
