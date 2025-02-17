package pe.edu.cibertec.cherryBite.model.bd;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

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
    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario;
    private Double peso;
    private Double altura;
    private Double imc;
    private Integer edad;
    @ManyToOne
    @JoinColumn(name = "idsexo")
    private Sexo sexo;
    private Boolean estado;

    @OneToMany(mappedBy = "persona",
            cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private Set<Detalle_Habito> habitos = new HashSet<>();

    @OneToMany(mappedBy = "persona",
            cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private Set<Detalle_Alimento> alimentos = new HashSet<>();
}
