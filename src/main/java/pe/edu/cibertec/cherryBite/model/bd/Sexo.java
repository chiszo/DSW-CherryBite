package pe.edu.cibertec.cherryBite.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sexo")
public class Sexo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idsexo;
    private String descripcion;
}
