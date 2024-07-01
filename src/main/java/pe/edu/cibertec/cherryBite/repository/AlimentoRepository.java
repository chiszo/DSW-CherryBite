package pe.edu.cibertec.cherryBite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.cherryBite.model.bd.Alimento;

import java.util.List;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Integer> {
    /*@Query("select a from alimento a"+
            " where" +
            " p.nombre" +
            " like %?1%")
    public List<Alimento> findAll(String nombre);*/
}
