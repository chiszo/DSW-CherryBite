package pe.edu.cibertec.cherryBite.service;

import pe.edu.cibertec.cherryBite.model.bd.Alimento;
import pe.edu.cibertec.cherryBite.model.bd.Noticia;

import java.util.List;

public interface INoticiaService {
    List<Noticia> listarNoticias();
}
