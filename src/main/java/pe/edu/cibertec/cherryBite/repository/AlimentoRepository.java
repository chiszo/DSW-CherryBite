package pe.edu.cibertec.cherryBite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.cherryBite.model.bd.Alimento;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Integer> {
}
