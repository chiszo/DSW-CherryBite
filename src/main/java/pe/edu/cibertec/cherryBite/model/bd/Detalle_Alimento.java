package pe.edu.cibertec.cherryBite.model.bd;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pe.edu.cibertec.cherryBite.model.bd.pk.AlimentoPersonaId;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "detalle_alimento")
public class Detalle_Alimento {
    @EmbeddedId
    private AlimentoPersonaId id;
    private Date fecha;

    @ManyToOne
    @MapsId("idpersona")
    @JoinColumn(name = "idpersona")
    @JsonBackReference
    private Persona persona;

    @ManyToOne
    @MapsId("idalimento")
    @JoinColumn(name = "idalimento")
    @JsonBackReference
    private Alimento alimento;
}
