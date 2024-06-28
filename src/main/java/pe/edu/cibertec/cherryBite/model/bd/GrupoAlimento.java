package pe.edu.cibertec.cherryBite.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "grupoalimento")
public class GrupoAlimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idgrupoalimento;
    private String descripcion;
}
