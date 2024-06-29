package pe.edu.cibertec.cherryBite.model.bd;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pe.edu.cibertec.cherryBite.model.bd.pk.HabitoPersonId;

@Getter
@Setter
@Entity
@Table(name = "detalle_habito")
public class Detalle_Habito {
    @EmbeddedId
    private HabitoPersonId id;
    private Boolean realizado;

    @ManyToOne
    @MapsId("idpersona")
    @JoinColumn(name = "idpersona")
    @JsonBackReference
    private Persona persona;

    @ManyToOne
    @MapsId("idhabito")
    @JoinColumn(name = "idhabito")
    @JsonBackReference
    private Habito habito;
}
