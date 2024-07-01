package pe.edu.cibertec.cherryBite.service;

import pe.edu.cibertec.cherryBite.model.bd.Alimento;

import java.util.List;
import java.util.Optional;

public interface IAlimentoService {
    List<Alimento> listarAlimentos();
    /*List<Alimento> listarAlimentosxNombre(String nombre);*/
}
