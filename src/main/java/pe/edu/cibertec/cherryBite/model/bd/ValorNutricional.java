package pe.edu.cibertec.cherryBite.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "valornutricional")
public class ValorNutricional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idvalornutricional;
    private Double calorias;
    private Double proteinas;
    private Double grasas;
    private Double carbohidratos;
    private Double colesterol;
    private Double sodio;
    private Double potasio;
}
