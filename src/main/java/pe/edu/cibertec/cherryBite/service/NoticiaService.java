package pe.edu.cibertec.cherryBite.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.cherryBite.model.bd.Noticia;
import pe.edu.cibertec.cherryBite.repository.NoticiaRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class NoticiaService implements INoticiaService{

    NoticiaRepository noticiaRepository;

    @Override
    public List<Noticia> listarNoticias() {
        return noticiaRepository.findAll();
    }
}
