package pe.edu.cibertec.cherryBite.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.cherryBite.model.bd.Alimento;
import pe.edu.cibertec.cherryBite.repository.AlimentoRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AlimentoService implements IAlimentoService{
    private AlimentoRepository alimentoRepository;
    @Override
    public List<Alimento> listarAlimentos() {
        return alimentoRepository.findAll();
    }
    /*
    @Override
    public List<Alimento> listarAlimentosxNombre(String nombre) {
        if (nombre!=null){
            return alimentoRepository.findAll(nombre);
        }
        return alimentoRepository.findAll();
    }*/

}
