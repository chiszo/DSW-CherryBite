package pe.edu.cibertec.cherryBite.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "habito")
public class Habito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idhabito;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "idcategoria")
    private Categoria categoria;
    private String frecuencia;
    private Date horadia;
    private Date fechainicio;
    private Date fechafin;
    private Integer progreso;
}
