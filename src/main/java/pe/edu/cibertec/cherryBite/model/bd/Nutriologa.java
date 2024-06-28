package pe.edu.cibertec.cherryBite.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "nutriologa")
public class Nutriologa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idnutriologa;
    private String nombres;
    private String apellidos;
    private String email;
    private String telf;
}
