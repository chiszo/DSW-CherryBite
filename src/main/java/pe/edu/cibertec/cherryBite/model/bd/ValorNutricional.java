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
    private int idvalornutricional;
    private double calorias;
    private double proteinas;
    private double grasas;
    private double carbohidratos;
    private double colesterol;
    private double sodio;
    private double potasio;
}
