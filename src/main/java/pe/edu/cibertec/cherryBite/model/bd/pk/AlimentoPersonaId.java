package pe.edu.cibertec.cherryBite.model.bd.pk;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class AlimentoPersonaId implements Serializable {
    private Integer idpersona;
    private Integer idalimento;
}
