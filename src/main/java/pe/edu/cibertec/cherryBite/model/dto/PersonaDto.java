package pe.edu.cibertec.cherryBite.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
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

    public PersonaDto(Integer idusuario, Integer idnutriologa, Integer edad, Integer idsexo){
        this.idusuario=idusuario;
        this.idnutriologa=idnutriologa;
        this.edad=edad;
        this.idsexo=idsexo;
    }
}
