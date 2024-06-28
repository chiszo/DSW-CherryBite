package pe.edu.cibertec.cherryBite.model.dto;

import lombok.Data;

@Data
public class ValorNutricionalDto implements DtoEntity {
    private int idvalornutricional;
    private double calorias;
    private double proteinas;
    private double grasas;
    private double carbohidratos;
    private double colesterol;
    private double sodio;
    private double potasio;
}
