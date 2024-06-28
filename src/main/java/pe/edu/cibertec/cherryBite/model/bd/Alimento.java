package pe.edu.cibertec.cherryBite.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "alimento")
public class Alimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idalimento;
    private String nombre;
    private Integer porcion;
    @ManyToOne
    @JoinColumn(name = "idgrupoalimento")
    private GrupoAlimento grupoAlimento;
    private String descripcion;
    private String imagen;
    @ManyToOne
    @JoinColumn(name = "idvalornutricional")
    private ValorNutricional valorNutricional;
}
