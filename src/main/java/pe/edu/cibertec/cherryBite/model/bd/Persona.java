package pe.edu.cibertec.cherryBite.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpersona;
    @ManyToOne
    @JoinColumn(name = "idnutriologa")
    private Nutriologa nutriologa;
    private Integer idusuario;
    private Double peso;
    private Double altura;
    private Double imc;
    private Integer edad;
    @ManyToOne
    @JoinColumn(name = "idsexo")
    private Sexo sexo;
    private Boolean estado;
}
